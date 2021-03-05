import { TestBed } from '@angular/core/testing';

import { SimpleService } from './simple.service';

describe('SimpleService', () => {
  let service: SimpleService;   // created null reference. 

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SimpleService);    //pull the object from container 
  });

  it('should be created', () => {
    expect(service).toBeTruthy();     // object created...
  });

  it("check login details ",()=>{
    let user="Ramesh";
    let pass = "123";
    let result = service.checkUser(user,pass);
    expect("Success").toEqual(result);
  });

});
