//package com.babydestination.automation.notificationHelper;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.HttpClientBuilder;
//import com.applitools.eyes.TestResults;
//
//import static jdk.vm.ci.meta.DeoptimizationReason.Unresolved;
//
//public class EyesSlack {
//
//    @SuppressWarnings("unused")
//    public static void post(TestResults testResults, String slackWebhookURL) {
//        // Define the color of the slack message
//        String messageColor = "";
//
//        // Define the default message for the Slack notification
//        String fallback = "Applitools Test Results";
//
//        // Check if test was aborted
//        if (testResults.isAborted())
//            messageColor = "A9A9A9"; // Dark Gray
//
//        // Check the test results and set the color and Slack notification message
//        switch (testResults.getStatus()) {
//            case Failed:
//                messageColor = "FF0000"; // Red
//                fallback = "Test Failed: " + testResults.getName();
//                break;
//            case Passed:
//                messageColor = "36a64f"; // Green
//                fallback = "Test Successfully Completed: " + testResults.getName();
//                break;
//            case Unresolved:
//                messageColor = "FFA500"; // Orange
//                fallback = "Test Mismatches Found: " + testResults.getName();
//                break;
//        }
//
//        // build the httpClient object which will send our request to Slack Webhook
//        HttpClient httpClient = HttpClientBuilder.create().build();
//
//        try {
//
//            // build the HttpPost request object
//            HttpPost request = new HttpPost(slackWebhookURL);
//
//            // build the HTTP request
//            StringEntity params = new StringEntity("{\n" +
//                    "\"attachments\": [\n" +
//                    "{\n" +
//                    "\"fallback\": \"" + fallback + ".\",\n" +
//                    "\"color\": \"#" + messageColor + "\",\n" +
//                    "\"pretext\": \"" + testResults.getStatus().toString() + "\",\n" +
//                    "\"author_name\": \"Applitools.com\",\n" +
//                    "\"author_link\": \"https://eyes.applitools.com\",\n" +
//                    "\"author_icon\": \"https://applitools.com/images/favicon.ico\",\n" +
//                    "\"title\": \"See Results\",\n" +
//                    "\"title_link\": \"" + testResults.getAppUrls().getBatch() + "\",\n" +
//                    "\"fields\": [\n" +
//                    "{\n" +
//                    "\"title\": \"App\",\n" +
//                    "\"value\": \"" + testResults.getAppName() + "\",\n" +
//                    "\"short\": true\n" +
//                    "}\n," +
//                    "{\n" +
//                    "\"title\": \"Test\",\n" +
//                    "\"value\": \"" + testResults.getName() + "\",\n" +
//                    "\"short\": true\n" +
//                    "}\n," +
//                    "{\n" +
//                    "\"title\": \"Batch\",\n" +
//                    "\"value\": \"" + testResults.getBatchName() + "\",\n" +
//                    "\"short\": true\n" +
//                    "}\n," +
//                    "{\n" +
//                    "\"title\": \"Branch\",\n" +
//                    "\"value\": \"" + testResults.getBranchName() + "\",\n" +
//                    "\"short\": true\n" +
//                    "}\n," +
//                    "{\n" +
//                    "\"title\": \"OS\",\n" +
//                    "\"value\": \"" + testResults.getHostOS() + "\",\n" +
//                    "\"short\": true\n" +
//                    "}\n," +
//                    "{\n" +
//                    "\"title\": \"Browser\",\n" +
//                    "\"value\": \"" + testResults.getHostApp() + "\",\n" +
//                    "\"short\": true\n" +
//                    "}\n," +
//                    "{\n" +
//                    "\"title\": \"Viewport\",\n" +
//                    "\"value\": \"" + testResults.getHostDisplaySize() + "\",\n" +
//                    "\"short\": true\n" +
//                    "}\n," +
//                    "{\n" +
//                    "\"title\": \"Duration\",\n" +
//                    "\"value\": \"" + testResults.getDuration() + " Seconds\",\n" +
//                    "\"short\": true\n" +
//                    "}\n," +
//                    "{\n" +
//                    "\"title\": \"Steps\",\n" +
//                    "\"value\": \"" + testResults.getSteps() + " Steps\",\n" +
//                    "\"short\": true\n" +
//                    "}\n" +
//                    "],\n" +
//                    "\"footer\": \"Test Start Time\",\n" +
//                    "\"footer_icon\": \"https://applitools.com/images/favicon.ico\",\n" +
//                    "\"ts\": " + testResults.getStartedAt().getTimeInMillis() / 1000 + "\n" +
//                    "}\n" +
//                    "]\n" +
//                    "}");
//            request.addHeader("content-type", "application/x-www-form-urlencoded");
//            request.setEntity(params);
//
//            // Executes the HTTP request
//            HttpResponse response = httpClient.execute(request);
//
//        } catch (Exception ex) {
////handle exception here
//        }
//    }
//}
//
// Webhook_URL: https://hooks.slack.com/services/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    #automation_reports channel
