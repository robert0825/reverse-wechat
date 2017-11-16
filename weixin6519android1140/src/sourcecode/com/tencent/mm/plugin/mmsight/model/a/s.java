package com.tencent.mm.plugin.mmsight.model.a;

import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public final class s
{
  public d.c ncn;
  public SparseArray<WeakReference<d.b>> nco;
  private ae ncp;
  
  public s()
  {
    GMTrace.i(18672236101632L, 139119);
    this.ncn = d.c.nah;
    this.nco = new SparseArray();
    this.ncp = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(18672772972544L, 139123);
        if (257 == paramAnonymousMessage.what)
        {
          paramAnonymousMessage = (d.c)paramAnonymousMessage.obj;
          int i = 0;
          while (i < s.this.nco.size())
          {
            if ((d.b)((WeakReference)s.this.nco.valueAt(i)).get() != null)
            {
              int[] arrayOfInt = s.2.ncr;
              paramAnonymousMessage.ordinal();
            }
            i += 1;
          }
          GMTrace.o(18672772972544L, 139123);
          return;
        }
        if (258 == paramAnonymousMessage.what)
        {
          paramAnonymousMessage = (d.b)paramAnonymousMessage.obj;
          if (paramAnonymousMessage == null)
          {
            GMTrace.o(18672772972544L, 139123);
            return;
          }
          s.this.nco.put(paramAnonymousMessage.hashCode(), new WeakReference(paramAnonymousMessage));
          GMTrace.o(18672772972544L, 139123);
          return;
        }
        if (259 == paramAnonymousMessage.what)
        {
          paramAnonymousMessage = (d.b)paramAnonymousMessage.obj;
          if (paramAnonymousMessage == null)
          {
            GMTrace.o(18672772972544L, 139123);
            return;
          }
          s.this.nco.remove(paramAnonymousMessage.hashCode());
        }
        GMTrace.o(18672772972544L, 139123);
      }
    };
    GMTrace.o(18672236101632L, 139119);
  }
  
  public final void a(d.c paramc)
  {
    GMTrace.i(18672370319360L, 139120);
    w.i("MicroMsg.SightMediaStatusHandler", "status change to %s", new Object[] { paramc.toString() });
    this.ncn = paramc;
    this.ncp.sendMessage(this.ncp.obtainMessage(257, paramc));
    GMTrace.o(18672370319360L, 139120);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */