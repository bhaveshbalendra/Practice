package main

import (
	"fmt"
	"slices"
)

// slice -> dynamic
// most used construct in go
// + useful methods
//slice weather you give max capacity or not it can resize

func main() {
	//uninitialized slice is nil = null in go
	// var nums []int 
	// fmt.Println(nums == nil)
	// fmt.Println(len(nums))

	//capacity max elm can fit
	// nums is a slice of integers ([]int).
	// It is created with length 0 (no elements initially).
	// It has a capacity of 5, meaning it can hold up to 5 elements before needing to resize and allocate more memory.
	//here 2 mean starting two number is added as default 0 best practice is to put zero
	//here 5 mean capacity max but its slice so it will increase as we add
	// var nums = make([]int,2,5)
	
	// fmt.Println(cap(nums))
	// fmt.Println(nums==nil)
	//append append number at end and then they are push front from back as number increase and rest are zero
	// nums = append(nums,1)

	//other why to make slice
	// nums:= []int{}
	// nums = append(nums, 1)
	// fmt.Println(nums)

	//adding using nums[0] then it must have some values initialized using var nums = make([]int,2,5)

	//copy function
	// var nums = make([]int,0,5)
	// nums = append(nums,2)
	// var nums2 = make([]int, len(nums))
	// copy(nums2,nums)
	// fmt.Println(nums,nums2)

	//slice operator
	// var nums = []int{1,2,3}
	// fmt.Println(nums[0:2])
	// fmt.Println(nums[:2])
	// fmt.Println(nums[1:])

	// slices
	var nums1 = []int{1, 2, 3}
	var nums2 = []int{1, 2, 4}

	fmt.Println(slices.Equal(nums1, nums2))

	// var nums = [][]int{{1, 2, 3}, {4, 5, 6}}
	// fmt.Println(nums)
	

}