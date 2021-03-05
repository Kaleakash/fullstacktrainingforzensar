describe("empInfo",()=> {
    it("Bonus Testing",()=> {
        var updatedSalary = empInfo(100,"Ramesh",45000,"Manager");
        expect(50000).toEqual(updatedSalary);
    });
});