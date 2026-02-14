def file = new File("C:\\Users\\gundl\\OneDrive\\Desktop\\subregion.csv")

def lines = file.readLines()

// Skip header and read first value
def subregion = lines[1].split(",")[0]

log.info "Subregion from Excel CSV: " + subregion

// Set TestCase property
testRunner.testCase.setPropertyValue("subregion", subregion)
