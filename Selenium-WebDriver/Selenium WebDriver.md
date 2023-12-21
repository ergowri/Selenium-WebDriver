# Selenium

# WebDriver

## Why WebDriver driver = new ChromeDriver();



# WebDriver Interface Methods

### Options manage();

### manage().window().maximize();

Maximize the current browser window

### void get(String url);

Open a new web page

### String getTitle();

Get the title of the current page

### String getCurrentUrl();

Get the url of the current page

### String getPageSource();

Get the source code of the current page

### Navigation navigate();

### WebDriver Navigation Interface Methods 

### navigate().to(String url);

Loads a new web page in the current browser window

### navigate().to(URL url);

Loads a new web page in the current browser window

### navigate().back();

Move the browser back

### navigate().forward();

Move the browser forward

### navigate().refresh();

Refresh the current page

### String getWindowHandle();

- Returns a unique identifier for currently focused browser window or tab
- We use when there are multiple windows open and we need to switch between them.

### Set String getWindowHandles();

- Returns a set of unique identifier for all the currently focused browser window or tab.
- We use when we want to iterate through all open windows or tabs.

### TargetLocator switchTo();

## WebDriver TargetLocator Interface Methods

### void close();

Close single browser window

### void quit();

Quits the driver and closes every associated window.


















