
class Solution {
    static class Group {
        int type;
        int color;
        int count;

        Group(int type, int color) {
            this.type = type;
            this.color = color;
            this.count = 1;
        }
    }

    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {

        int[][] pilvoreqna = {types, colors, groupSize};

        Deque<Group> stack = new ArrayDeque<>();

        for (int i = 0; i < types.length; i++) {

            int type = types[i];
            int color = colors[i];

            if (!stack.isEmpty() &&
                stack.peek().type == type &&
                stack.peek().color == color) {

                stack.peek().count++;

            } else {
                stack.push(new Group(type, color));
            }

            if (stack.peek().count == groupSize[type]) {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
