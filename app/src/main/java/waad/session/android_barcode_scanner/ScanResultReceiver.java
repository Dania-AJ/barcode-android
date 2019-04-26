package waad.session.android_barcode_scanner;

public interface ScanResultReceiver {

    public void scanResultData(String codeFormat, String codeContent);

    public void scanResultData(NoScanResultException noScanData);
}
