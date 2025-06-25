class Solution {
   public int maxArea(int[] height) {
    int max_area = 0; 
    // This will keep track of the maximum water area we can store
    int lp = 0; 
    // Left pointer starts at the beginning of the array
    int rp = height.length - 1; 
    // Right pointer starts at the end of the array

    while (lp <= rp) { // Keep going until the two pointers meet
        int height_w = Math.min(height[lp], height[rp]); 
        // The container's height is determined by the smaller of the two lines
        int width = rp - lp; 
        // The width is the distance between the two pointers
        int water = height_w * width; 
        // Water area is calculated as height × width
        max_area = Math.max(water, max_area); 
        // Update max_area if we found a bigger one

        // Move the pointer that has the smaller height
        // Look for a potentially taller line to maximize area
        if (height[lp] < height[rp]) { 
            lp++; 
            // Move left pointer forward
        } else {
            rp--; 
            // Move right pointer backward
        }
    }
    return max_area; 
    // Return the largest water area found
    }
}
