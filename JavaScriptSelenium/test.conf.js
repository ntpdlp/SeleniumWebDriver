exports.config = {

    //specs
    specs: [
    //  "wdioAPI/api_setValue.js",
    //     "wdioAPI/api_waitfor.js",   
        // "wdioAPI/api_click.js",
        // "wdioAPI/api_selectBy.js",
        "wdioAPI/api_getText.js"
    ],

    //host
    runner: 'local',
    hostname: 'localhost',
    port: 9515,
    path: '/',

    //testframework
    framework: 'mocha',
    mochaOpts: {
        ui: 'bdd'
    },

    capabilities: {
        myChromeBrowser: {
            capabilities: {
                browserName: 'chrome'
            }
        }
    },

    reporters: [
        ['junit', {
            outputDir: './MyReport' 
            }
        ]
    ],

}