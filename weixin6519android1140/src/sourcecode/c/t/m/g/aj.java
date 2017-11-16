package c.t.m.g;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

final class aj
  implements HostnameVerifier
{
  aj(ai paramai) {}
  
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.a.l, paramSSLSession);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */