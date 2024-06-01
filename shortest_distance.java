public class shortest_distance {
    public static void main(String arg[]) {
        System.out.println("The shortest diatnce is " + getShortestDistance("WNEENESENNN"));
    }

    static double getShortestDistance(String path) {
        // Calculate Destination Coordiante (x,y)
        int count = 0;
        int x = 0;
        int y = 0;
        while (count != path.length()) {
            char direction = path.charAt(count);
            if (direction == 'E')
                x++;
            else if (direction == 'W')
                x--;
            else if (direction == 'N')
                y++;
            else
                y--;
            count++;
        }

        // Calculate Shortest Distance
        // start cordinate is always (0,0)
        x = x * x;
        y = y * y;
        return Math.sqrt(x + y);
    }
}
