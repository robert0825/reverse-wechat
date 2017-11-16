package com.tencent.mm.plugin.ipcall;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.hk;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  implements com.tencent.mm.ad.e
{
  private static a mie;
  boolean gqR;
  public long mia;
  private long mib;
  long mic;
  long mid;
  
  static
  {
    GMTrace.i(11621376196608L, 86586);
    mie = null;
    GMTrace.o(11621376196608L, 86586);
  }
  
  private a()
  {
    GMTrace.i(11620436672512L, 86579);
    this.gqR = false;
    this.mia = -1L;
    this.mib = -1L;
    this.mic = -1L;
    this.mid = -1L;
    GMTrace.o(11620436672512L, 86579);
  }
  
  public static a aHD()
  {
    GMTrace.i(11620570890240L, 86580);
    if (mie == null) {
      mie = new a();
    }
    a locala = mie;
    GMTrace.o(11620570890240L, 86580);
    return locala;
  }
  
  static void aHE()
  {
    GMTrace.i(11620973543424L, 86583);
    long l = System.currentTimeMillis();
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vrW, Long.valueOf(l));
    GMTrace.o(11620973543424L, 86583);
  }
  
  public final void Pi()
  {
    GMTrace.i(11620705107968L, 86581);
    if (!com.tencent.mm.plugin.ipcall.b.a.Hr()) {
      w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, can't sync addr book");
    }
    if (this.gqR)
    {
      w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, updating");
      GMTrace.o(11620705107968L, 86581);
      return;
    }
    long l = System.currentTimeMillis();
    at.AR();
    if (Math.abs(l - ((Long)com.tencent.mm.y.c.xh().get(w.a.vrW, Long.valueOf(0L))).longValue()) >= 86400000L)
    {
      this.gqR = true;
      this.mia = -1L;
      this.mib = -1L;
      this.mic = -1L;
      this.mid = -1L;
      at.wS().a(32, this);
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11564602097664L, 86163);
          w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "start GetMFriend");
          hk localhk = new hk();
          localhk.eKI.scene = 2;
          com.tencent.mm.sdk.b.a.vgX.m(localhk);
          a.this.mia = System.currentTimeMillis();
          GMTrace.o(11564602097664L, 86163);
        }
      }, "IPCallAddressBookUpdater_updateUsername");
      GMTrace.o(11620705107968L, 86581);
      return;
    }
    w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, not reach time limit");
    GMTrace.o(11620705107968L, 86581);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11620839325696L, 86582);
    w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.gqR) });
    if (!this.gqR)
    {
      GMTrace.o(11620839325696L, 86582);
      return;
    }
    at.wS().b(32, this);
    this.mib = System.currentTimeMillis();
    w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "GetMFriend used %dms", new Object[] { Long.valueOf(this.mib - this.mia) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "GetMFriend failed");
      this.gqR = false;
      aHE();
      GMTrace.o(11620839325696L, 86582);
      return;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11565541621760L, 86170);
        a locala = a.this;
        w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "updateUsernameAfterGetMFriend");
        locala.mic = System.currentTimeMillis();
        Object localObject = i.aIu().aIX();
        if ((localObject != null) && (((ArrayList)localObject).size() > 0))
        {
          w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "addressitemList.size: %d", new Object[] { Integer.valueOf(((ArrayList)localObject).size()) });
          long l = i.aIu().cE(Thread.currentThread().getId());
          localObject = ((ArrayList)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            com.tencent.mm.plugin.ipcall.a.g.c localc = (com.tencent.mm.plugin.ipcall.a.g.c)((Iterator)localObject).next();
            String str = com.tencent.mm.plugin.ipcall.b.a.AH(localc.field_contactId);
            if ((localc.vmr > 0L) && (!bg.nm(str)))
            {
              w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "update username for contactId: %s, newUsername: %s, oldUsername: %s", new Object[] { localc.field_contactId, str, localc.field_wechatUsername });
              if (((!bg.nm(localc.field_wechatUsername)) && (!localc.field_wechatUsername.equals(str))) || (bg.nm(localc.field_wechatUsername)))
              {
                localc.field_wechatUsername = str;
                i.aIu().a(localc.vmr, localc);
              }
            }
          }
          i.aIu().cF(l);
        }
        locala.mid = System.currentTimeMillis();
        w.d("MicroMsg.IPCallAddressBookUsernameUpdater", "update username use %dms", new Object[] { Long.valueOf(locala.mid - locala.mic) });
        locala.gqR = false;
        a.aHE();
        GMTrace.o(11565541621760L, 86170);
      }
    }, "IPCallAddressBookUsernameUpdater_updateUsernameAfterGetMFriend");
    GMTrace.o(11620839325696L, 86582);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */