public class SampleSquash {
	
	@Before
	public void before(Scenario scenario) throws MalformedURLException {
		logger.info("Called openBrowser for scenario [{}]", scenario.getId());
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	
	
	
}