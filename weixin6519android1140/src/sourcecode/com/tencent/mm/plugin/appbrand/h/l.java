package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class l
  implements X509TrustManager
{
  private LinkedList<X509TrustManager> itC;
  private LinkedList<X509TrustManager> itD;
  KeyStore itE;
  private X509Certificate[] itF;
  
  public l()
  {
    GMTrace.i(15565095698432L, 115969);
    this.itC = new LinkedList();
    this.itD = new LinkedList();
    try
    {
      this.itE = KeyStore.getInstance(KeyStore.getDefaultType());
      this.itE.load(null, null);
      GMTrace.o(15565095698432L, 115969);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandX509TrustManager", "Local KeyStore init failed");
      GMTrace.o(15565095698432L, 115969);
    }
  }
  
  private void YV()
  {
    GMTrace.i(15565766787072L, 115974);
    if (this.itE == null)
    {
      GMTrace.o(15565766787072L, 115974);
      return;
    }
    try
    {
      Object localObject = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      ((TrustManagerFactory)localObject).init(this.itE);
      localObject = ((TrustManagerFactory)localObject).getTrustManagers();
      int i = 0;
      while ((localObject != null) && (i < localObject.length))
      {
        this.itD.add((X509TrustManager)localObject[i]);
        i += 1;
      }
      GMTrace.o(15565766787072L, 115974);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandX509TrustManager", "initLocalTrustManager: " + localException);
      GMTrace.o(15565766787072L, 115974);
    }
  }
  
  private void YW()
  {
    GMTrace.i(15565901004800L, 115975);
    ArrayList localArrayList = new ArrayList();
    long l1 = System.currentTimeMillis();
    Iterator localIterator = this.itC.iterator();
    X509Certificate[] arrayOfX509Certificate;
    while (localIterator.hasNext())
    {
      arrayOfX509Certificate = ((X509TrustManager)localIterator.next()).getAcceptedIssuers();
      if (arrayOfX509Certificate != null) {
        localArrayList.addAll(Arrays.asList(arrayOfX509Certificate));
      }
    }
    long l2 = System.currentTimeMillis();
    localIterator = this.itD.iterator();
    while (localIterator.hasNext())
    {
      arrayOfX509Certificate = ((X509TrustManager)localIterator.next()).getAcceptedIssuers();
      if (arrayOfX509Certificate != null) {
        localArrayList.addAll(Arrays.asList(arrayOfX509Certificate));
      }
    }
    long l3 = System.currentTimeMillis();
    this.itF = new X509Certificate[localArrayList.size()];
    this.itF = ((X509Certificate[])localArrayList.toArray(this.itF));
    w.i("MicroMsg.AppBrandX509TrustManager", "initAcceptedIssuers: %d, %d, %d", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(System.currentTimeMillis() - l3) });
    GMTrace.o(15565901004800L, 115975);
  }
  
  public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    GMTrace.i(15565229916160L, 115970);
    throw new CertificateException("Client Certification not supported");
  }
  
  public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    GMTrace.i(15565364133888L, 115971);
    Iterator localIterator = this.itC.iterator();
    X509TrustManager localX509TrustManager;
    if (localIterator.hasNext()) {
      localX509TrustManager = (X509TrustManager)localIterator.next();
    }
    for (;;)
    {
      try
      {
        localX509TrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString);
        i = 1;
        if (i != 0)
        {
          GMTrace.o(15565364133888L, 115971);
          return;
        }
        localIterator = this.itD.iterator();
        if (!localIterator.hasNext()) {
          break label138;
        }
        localX509TrustManager = (X509TrustManager)localIterator.next();
      }
      catch (CertificateException localCertificateException1)
      {
        try
        {
          localX509TrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString);
          i = 1;
          if (i != 0)
          {
            GMTrace.o(15565364133888L, 115971);
            return;
          }
          throw new CertificateException("Server Certificate not trusted");
        }
        catch (CertificateException localCertificateException2) {}
        localCertificateException1 = localCertificateException1;
      }
      continue;
      label138:
      int i = 0;
      continue;
      i = 0;
    }
  }
  
  public final X509Certificate[] getAcceptedIssuers()
  {
    GMTrace.i(15565498351616L, 115972);
    X509Certificate[] arrayOfX509Certificate = this.itF;
    GMTrace.o(15565498351616L, 115972);
    return arrayOfX509Certificate;
  }
  
  public final void init()
  {
    GMTrace.i(17400388911104L, 129643);
    try
    {
      Object localObject = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      ((TrustManagerFactory)localObject).init(null);
      localObject = ((TrustManagerFactory)localObject).getTrustManagers();
      int i = 0;
      while ((localObject != null) && (i < localObject.length))
      {
        this.itC.add((X509TrustManager)localObject[i]);
        i += 1;
      }
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandX509TrustManager", "init SystemTrustManager: " + localException);
      YV();
      YW();
      GMTrace.o(17400388911104L, 129643);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */