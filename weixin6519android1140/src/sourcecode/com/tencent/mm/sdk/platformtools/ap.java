package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import java.util.List;

public final class ap
{
  public static boolean eXh;
  private TelephonyManager vjY;
  private PhoneStateListener vjZ;
  public List<a> vka;
  
  public ap()
  {
    GMTrace.i(13940792754176L, 103867);
    this.vka = new LinkedList();
    GMTrace.o(13940792754176L, 103867);
  }
  
  public static boolean qk()
  {
    GMTrace.i(18799206072320L, 140065);
    w.i("MicroMsg.PhoneStatusWatcher", "alvinluo isCalling: %b", new Object[] { Boolean.valueOf(eXh) });
    boolean bool = eXh;
    GMTrace.o(18799206072320L, 140065);
    return bool;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(13940926971904L, 103868);
    this.vka.add(parama);
    GMTrace.o(13940926971904L, 103868);
  }
  
  public final void bQu()
  {
    GMTrace.i(20319624495104L, 151393);
    this.vka.clear();
    GMTrace.o(20319624495104L, 151393);
  }
  
  public final void eA(Context paramContext)
  {
    GMTrace.i(13941061189632L, 103869);
    w.i("MicroMsg.PhoneStatusWatcher", "alvinluo PhoneStatusWatcher begin");
    if (this.vjY == null) {
      this.vjY = ((TelephonyManager)paramContext.getSystemService("phone"));
    }
    if (this.vjZ == null) {
      this.vjZ = new PhoneStateListener()
      {
        public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(13926565675008L, 103761);
          w.i("MicroMsg.PhoneStatusWatcher", "alvinluo onCallStateChanged state: %d, incomingNumber: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          if (ap.this.vka.size() > 0)
          {
            ap.a[] arrayOfa = new ap.a[ap.this.vka.size()];
            arrayOfa = (ap.a[])ap.this.vka.toArray(arrayOfa);
            int j = arrayOfa.length;
            int i = 0;
            while (i < j)
            {
              arrayOfa[i].dR(paramAnonymousInt);
              i += 1;
            }
          }
          super.onCallStateChanged(paramAnonymousInt, paramAnonymousString);
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(13926565675008L, 103761);
            return;
            ap.eXh = false;
            GMTrace.o(13926565675008L, 103761);
            return;
            ap.eXh = true;
          }
        }
      };
    }
    this.vjY.listen(this.vjZ, 32);
    GMTrace.o(13941061189632L, 103869);
  }
  
  public final void end()
  {
    GMTrace.i(20319758712832L, 151394);
    w.i("MicroMsg.PhoneStatusWatcher", "alvinluo PhoneStatusWatcher end");
    if (this.vjY != null)
    {
      this.vjY.listen(this.vjZ, 0);
      this.vjZ = null;
    }
    GMTrace.o(20319758712832L, 151394);
  }
  
  public static abstract interface a
  {
    public abstract void dR(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */