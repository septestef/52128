import ScheduleVisitor from './generated/ScheduleVisitor.js';

class ScheduleCustomVisitor extends ScheduleVisitor {
  visitSchedule(ctx) {
    const fields = ctx.time_field().map(field => this.visit(field));
    return fields;
  }

  visitValue(ctx) {
    return { type: 'value', value: parseInt(ctx.getText(), 10) };
  }

  visitRange(ctx) {
    const nums = ctx.number().map(n => parseInt(n.getText(), 10));
    const result = { type: 'range', from: nums[0], to: nums[1] };
    if (nums.length === 3) {
      result.step = nums[2];
    }
    return result;
  }

  visitStep(ctx) {
    const base = this.visit(ctx.getChild(0));
    const step = parseInt(ctx.number().getText(), 10);
    return { type: 'step', base, step };
  }

  visitWildcard(ctx) {
    return { type: 'wildcard', value: '*' };
  }

  visitList(ctx) {
    const items = ctx.item().map(i => this.visit(i));
    return { type: 'list', items };
  }

  visitItem(ctx) {
    if (ctx.range()) return this.visit(ctx.range());
    return this.visit(ctx.value());
  }

  visitPredefined(ctx) {
    return { type: 'predefined', value: ctx.getText() };
  }
}

export default ScheduleCustomVisitor;
