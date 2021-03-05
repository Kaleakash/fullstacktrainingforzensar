import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;    // component object created without new keywords. 
    expect(app).toBeTruthy();     // App component created... Yes or No
  });

  it(`should have as title 'angular-testing'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('angular-testing');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();    //render the data on view or template 
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('#abc').textContent).toContain('Welcome to Angular Testing');
  });

  //Component testing for variable and functions. 
  it("Name and function testing",()=> {
    const fixuture =  TestBed.createComponent(AppComponent);
    const app = fixuture.componentInstance;
    expect(app.name).toEqual("Akash Kale");
    var result = app.display("Ajay");
    expect("welcome Ajay").toEqual(result);
  });

  //template testing 
  it('name property on template testing', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();    //render the data on view or template 
    const compiled = fixture.nativeElement; // to refere dom tag we have to create the reference. 
    expect(compiled.querySelector('p').textContent).toEqual("Welcome Akash Kale")
    //select tag using class, id,tg name, child selector 
  });

});






