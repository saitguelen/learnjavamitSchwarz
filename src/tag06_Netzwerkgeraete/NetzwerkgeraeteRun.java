package tag06_Netzwerkgeraete;

public class NetzwerkgeraeteRun {
    public static void main(String[] args){

        //Router
        Router router = new Router("Cisco", "C8500-12X4QC", "192.168.0.1", 12);
        System.out.println(router.toString());
        router.routeVerbindung();

        System.out.println();

        // Switch
        Switch sw = new Switch("Netgear", "GS108", "192.168.0.2", 1000.0);
        System.out.println(sw.toString());
        sw.schalteDaten();

        System.out.println();

        // Access Point
        AccessPoint ap = new AccessPoint("TP-Link", "EAP245", "192.168.0.3", 50);
        System.out.println(ap.toString());
        ap.verbindeGeraet();

    }
}
