package org.epam.testing.google.cloud;

public class Constants {
    public static class HomePageConstants{
        public static final int EXPLICIT_WAIT = 20;
        public static final String HOME_PAGE_URL = "https://cloud.google.com/";
        public static final String SEARCH_TERM = "Google Cloud Platform Pricing Calculator";
        public static final String HOME_PAGE_SEARCH_SELECTOR = "//input[@name='q']";
    }

    public static class SearchResultsPageConstants{
        public static final String PLATFORM_PRICING_CALCULATOR_SELECTOR = "//div[@class = 'gs-title']//*[text()='Google Cloud Pricing Calculator']";
    }

    public static class PricingCalculatorPageConstants{
        public static final String COMPUTE_ENGINE_SECTION_BUTTON_XPATH = "(//div[@title='Compute Engine'])[1]";
        public static final String NUMBER_OF_INSTANCE_SELECTOR = "//input[@ng-model = 'listingCtrl.computeServer.quantity']";
        public static final String OC_SOFTWARE_SELECTOR = "//md-select-value[@id = 'select_value_label_90']";
        public static final String OC_SOFTWARE_VALUE_SELECTOR = "//md-option[@value = 'free']/div[@class = 'md-text']";
        public static final String PROVISIONING_MODEL_SELECTOR = "//md-select-value[@id = 'select_value_label_91']";
        public static final String PROVISIONING_MODEL_VALUE_SELECTOR = "//md-option[@value = 'regular']";
        public static final String MACHINE_FAMILY_SELECTOR = "//md-select-value[@id = 'select_value_label_92']";
        public static final String MACHINE_FAMILY_VALUE = "//md-option[@id = 'select_option_117']";
        public static final String SERIES_SELECTOR = "//md-select-value[@id = 'select_value_label_93']";
        public static final String SERIES_VALUE = "//md-option[@value = 'n1']";
        public static final String MACHINE_TYPE_SELECTOR = "//md-select-value[@id = 'select_value_label_94']";
        public static final String MACHINE_TYPE_VALUE = "//md-option[@id = 'select_option_469']";
        public static final String GPUs_MARK_BOX_SELECTOR = "(//md-checkbox[@aria-label = 'Add GPUs'])[1]";
        public static final String GPU_TYPE_SELECTOR = "//md-select[@placeholder = 'GPU type']";
        public static final String GPU_TYPE_VALUE =  "//div[contains(text(),'NVIDIA Tesla V100')]";
        public static final String GPU_NUMBER_SELECTOR = "//md-select-value[@id='select_value_label_504']";
        public static final String GPU_NUMBER_VALUE = "//md-option[@id='select_option_515']";
        public static final String LOCAL_SSD_SELECTOR = "//md-select-value[@id='select_value_label_463']";
        public static final String LOCAL_SSD_VALUE = "//md-option[@id='select_option_490']";
        public static final String DATACENTER_LOCATION_SELECTOR = "//md-select-value[@id='select_value_label_96']";
        public static final String DATACENTER_VALUE = "//md-option[@id='select_option_263']";
        public static final String COMMITTED_USAGE_SELECTOR = "//md-select-value[@id='select_value_label_97']";
        public static final String COMMITTED_USAGE_VALUE = "//md-option[@id='select_option_136']";
        public static final String ADD_TO_ESTIMATE_BUTTON_SELECTOR = "//button[contains(@class, 'md-raised md-primary cpc-button md-button md-ink-ripple')]";
        public static final String TOTAL_ESTIMATED_COST = "//b[contains(text(), 'Total Estimated Cost')]";
        public static final String SEND_EMAIL_LINK = "//span[text() = 'email']";
        public static final String INPUT_EMAIL_FIELD = "//input[@id = 'input_615']";
        public static final String SEND_EMAIL_BUTTON = "//button[contains(text(), 'Send Email')]";
    }
}