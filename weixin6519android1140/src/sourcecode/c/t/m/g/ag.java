package c.t.m.g;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ag
  extends SSLSocketFactory
{
  private static Map<String, SSLSocket> b = new ConcurrentHashMap();
  private HttpsURLConnection a;
  
  public ag(HttpsURLConnection paramHttpsURLConnection)
  {
    ag.class.getSimpleName();
    HttpsURLConnection.getDefaultHostnameVerifier();
    this.a = paramHttpsURLConnection;
  }
  
  public Socket createSocket()
  {
    return null;
  }
  
  public Socket createSocket(String paramString, int paramInt)
  {
    return null;
  }
  
  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
  {
    return null;
  }
  
  public Socket createSocket(InetAddress paramInetAddress, int paramInt)
  {
    return null;
  }
  
  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
  {
    return null;
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    Object localObject = this.a.getRequestProperty("Host");
    if (localObject == null) {}
    for (;;)
    {
      InetAddress localInetAddress = paramSocket.getInetAddress();
      if (paramBoolean) {
        paramSocket.close();
      }
      paramSocket = null;
      try
      {
        if (l.a() != null) {
          paramSocket = (SSLCertificateSocketFactory)SSLCertificateSocketFactory.getDefault(0, new SSLSessionCache(l.a()));
        }
        localObject = paramSocket;
      }
      catch (Throwable paramSocket)
      {
        for (;;)
        {
          try
          {
            SSLSocket localSSLSocket;
            paramSocket.getClass().getMethod("setHostname", new Class[] { String.class }).invoke(paramSocket, new Object[] { paramString });
            return paramSocket;
          }
          catch (Exception paramString)
          {
            int i;
            return paramSocket;
          }
          paramSocket = paramSocket;
          localObject = (SSLCertificateSocketFactory)SSLCertificateSocketFactory.getDefault(0);
          continue;
          i = 0;
          continue;
          paramSocket = (SSLSocket)((SSLCertificateSocketFactory)localObject).createSocket(localInetAddress, paramInt);
        }
      }
      if (u.a("direct_https_reuse_conn", 0, 1, 1) == 1)
      {
        i = 1;
        if (i == 0) {
          break label193;
        }
        localSSLSocket = (SSLSocket)b.get(paramString);
        if (localSSLSocket != null)
        {
          paramSocket = localSSLSocket;
          if (!localSSLSocket.isClosed()) {}
        }
        else
        {
          paramSocket = (SSLSocket)((SSLCertificateSocketFactory)localObject).createSocket(localInetAddress, paramInt);
          b.put(paramString, paramSocket);
        }
        paramSocket.setEnabledProtocols(paramSocket.getSupportedProtocols());
      }
      label193:
      paramString = (String)localObject;
    }
  }
  
  public String[] getDefaultCipherSuites()
  {
    return new String[0];
  }
  
  public String[] getSupportedCipherSuites()
  {
    return new String[0];
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */