describe("Operation",function(){			// like a jUnit class. Test suite 
	
	it("add",function() {		// like a function @Test in junit test spec 
	var res = add(10,20);
	expect(30).toEqual(res);						// like a assert 
	});

	it("sub",function() {
		var res1 = sub(100,50);
		expect(50).toEqual(res1);
	})
});