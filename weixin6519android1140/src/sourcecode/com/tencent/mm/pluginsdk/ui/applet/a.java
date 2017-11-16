package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.jh;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.protocal.c.bnl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.r;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class a
  implements e
{
  private String chatroomName;
  private Context context;
  private r hsU;
  public String nLA;
  private LinkedList<String> nZs;
  private LinkedList<Integer> nZt;
  private a twm;
  public b twn;
  private LinkedList<String> two;
  public String twp;
  public String twq;
  public String twr;
  public String tws;
  public boolean twt;
  public boolean twu;
  public String twv;
  public boolean tww;
  
  public a(Context paramContext, a parama)
  {
    GMTrace.i(937108176896L, 6982);
    this.nLA = "";
    this.twq = "";
    this.chatroomName = "";
    this.twt = true;
    this.twu = true;
    this.twv = "";
    this.tww = false;
    this.context = paramContext;
    this.twm = parama;
    this.nZs = new LinkedList();
    this.two = new LinkedList();
    this.hsU = null;
    GMTrace.o(937108176896L, 6982);
  }
  
  private void a(String paramString1, LinkedList<Integer> paramLinkedList, boolean paramBoolean, String paramString2)
  {
    GMTrace.i(937913483264L, 6988);
    if ((paramString1 != null) && (paramString1.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramLinkedList == null) {
        break label209;
      }
    }
    label209:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.twt = paramBoolean;
      com.tencent.mm.kernel.h.xx().fYr.a(30, this);
      if (this.twu)
      {
        Context localContext = this.context;
        this.context.getString(a.h.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a(localContext, this.context.getString(a.h.kbY), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(945429676032L, 7044);
            a.this.c(false, false, a.this.twq, a.this.twv);
            GMTrace.o(945429676032L, 7044);
          }
        });
      }
      this.nZt = paramLinkedList;
      this.nZs.add(paramString1);
      this.twq = paramString1;
      paramString1 = new com.tencent.mm.pluginsdk.model.n(1, this.nZs, paramLinkedList, this.two, "", this.nLA, null, this.chatroomName, paramString2);
      if (!bg.nm(this.twr)) {
        paramString1.eC(this.twr, this.tws);
      }
      com.tencent.mm.kernel.h.xx().fYr.a(paramString1, 0);
      GMTrace.o(937913483264L, 6988);
      return;
      bool = false;
      break;
    }
  }
  
  private void t(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(938316136448L, 6991);
    if ((this.tww) && (!bg.nm(paramString))) {
      Toast.makeText(this.context, paramString, 1).show();
    }
    for (;;)
    {
      c(false, false, this.twq, this.twv);
      GMTrace.o(938316136448L, 6991);
      return;
      if ((paramInt1 == 4) && (paramInt2 == -22)) {
        Toast.makeText(this.context, this.context.getString(a.h.cQE), 1).show();
      } else if ((paramInt1 == 4) && (paramInt2 == -24) && (!bg.nm(paramString))) {
        Toast.makeText(this.context, paramString, 1).show();
      } else {
        Toast.makeText(this.context, this.context.getString(a.h.cQD), 1).show();
      }
    }
  }
  
  public final void Pd(String paramString)
  {
    GMTrace.i(937645047808L, 6986);
    if (!TextUtils.isEmpty(paramString)) {
      this.two.add(paramString);
    }
    GMTrace.o(937645047808L, 6986);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(938181918720L, 6990);
    w.d("MicroMsg.AddContact", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2 + "," + paramString);
    if (paramk.getType() != 30)
    {
      w.w("MicroMsg.AddContact", "not expected scene,  type = " + paramk.getType());
      GMTrace.o(938181918720L, 6990);
      return;
    }
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    com.tencent.mm.kernel.h.xx().fYr.b(30, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.twq = ((com.tencent.mm.pluginsdk.model.n)paramk).bJk();
      c(true, false, this.twq, this.twv);
      GMTrace.o(938181918720L, 6990);
      return;
    }
    if (paramInt2 == -44)
    {
      paramString = this.twv;
      if (this.twn != null)
      {
        this.twn.aJw();
        c(false, false, this.twq, paramString);
        GMTrace.o(938181918720L, 6990);
        return;
      }
      paramString = new q(this.context, new q.a()
      {
        public final void dG(boolean paramAnonymousBoolean)
        {
          GMTrace.i(962475327488L, 7171);
          String str = a.this.twv;
          a.this.c(false, paramAnonymousBoolean, a.this.twq, str);
          GMTrace.o(962475327488L, 7171);
        }
      });
      if (this.twp != null) {
        paramString.twp = this.twp;
      }
      if (this.twt)
      {
        paramk = this.nZs;
        LinkedList localLinkedList = this.nZt;
        paramString.txU = false;
        paramString.onStart();
        com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.pluginsdk.model.n(2, paramk, localLinkedList, "", ""), 0);
        GMTrace.o(938181918720L, 6990);
        return;
      }
      paramString.g(this.nZs, this.nZt);
      GMTrace.o(938181918720L, 6990);
      return;
    }
    if (paramInt2 == -87)
    {
      com.tencent.mm.ui.base.h.b(this.context, this.context.getString(a.h.diR), "", true);
      GMTrace.o(938181918720L, 6990);
      return;
    }
    if ((paramInt2 == -101) && (!bg.nm(paramString)))
    {
      w.d("MicroMsg.AddContact", "jacks catch add Contact errCode: %d && errMsg: %s", new Object[] { Integer.valueOf(paramInt2), paramString });
      com.tencent.mm.ui.base.h.a(this.context, paramString, "", false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(962206892032L, 7169);
          a.this.c(false, false, a.this.twq, a.this.twv);
          GMTrace.o(962206892032L, 7169);
        }
      });
      GMTrace.o(938181918720L, 6990);
      return;
    }
    if (paramInt2 == 65234)
    {
      paramInt1 = ((com.tencent.mm.pluginsdk.model.n)paramk).eHJ;
      w.d("MicroMsg.AddContact", "onSceneEnd, verify relation out of date, opCode = %d", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 == 3) {
        com.tencent.mm.ui.base.h.a(this.context, this.context.getString(a.h.dlx), this.context.getString(a.h.cUG), this.context.getString(a.h.cRK), this.context.getString(a.h.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(934558040064L, 6963);
            w.d("MicroMsg.AddContact", "dealwith verify relation out of date");
            paramAnonymousDialogInterface = (com.tencent.mm.pluginsdk.model.n)paramk;
            if ((paramAnonymousDialogInterface.fUa != null) && (paramAnonymousDialogInterface.fUa.DC() != null)) {}
            for (paramAnonymousDialogInterface = ((bnl)paramAnonymousDialogInterface.fUa.gtC.gtK).uXx;; paramAnonymousDialogInterface = null)
            {
              List localList = ((com.tencent.mm.pluginsdk.model.n)paramk).tmZ;
              if ((localList != null) && (localList.size() > 0)) {
                a.this.c((String)localList.get(0), paramAnonymousDialogInterface);
              }
              GMTrace.o(934558040064L, 6963);
              return;
            }
          }
        }, null);
      }
      GMTrace.o(938181918720L, 6990);
      return;
    }
    if (paramInt2 == -2)
    {
      if (!bg.nm(paramString))
      {
        com.tencent.mm.ui.base.h.a(this.context, paramString, this.context.getString(a.h.cUG), this.context.getString(a.h.cTM), null);
        GMTrace.o(938181918720L, 6990);
        return;
      }
      t(paramInt1, paramInt2, null);
      GMTrace.o(938181918720L, 6990);
      return;
    }
    t(paramInt1, paramInt2, paramString);
    GMTrace.o(938181918720L, 6990);
  }
  
  public final void a(String paramString1, LinkedList<Integer> paramLinkedList, String paramString2)
  {
    GMTrace.i(937510830080L, 6985);
    a(paramString1, paramLinkedList, false, paramString2);
    GMTrace.o(937510830080L, 6985);
  }
  
  public final void b(String paramString1, String paramString2, LinkedList<Integer> paramLinkedList)
  {
    GMTrace.i(937242394624L, 6983);
    this.chatroomName = paramString2;
    a(paramString1, paramLinkedList, false, "");
    GMTrace.o(937242394624L, 6983);
  }
  
  public final void b(String paramString, LinkedList<Integer> paramLinkedList, boolean paramBoolean)
  {
    GMTrace.i(937779265536L, 6987);
    a(paramString, paramLinkedList, paramBoolean, "");
    GMTrace.o(937779265536L, 6987);
  }
  
  public final void c(String paramString, LinkedList<Integer> paramLinkedList)
  {
    GMTrace.i(937376612352L, 6984);
    a(paramString, paramLinkedList, false, "");
    GMTrace.o(937376612352L, 6984);
  }
  
  public final void c(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    GMTrace.i(938047700992L, 6989);
    if (this.twm != null) {
      this.twm.a(paramBoolean1, paramBoolean2, paramString1, paramString2);
    }
    if (paramBoolean1)
    {
      paramString2 = new jh();
      paramString2.eMV.username = paramString1;
      com.tencent.mm.sdk.b.a.vgX.m(paramString2);
    }
    GMTrace.o(938047700992L, 6989);
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2);
  }
  
  public static abstract interface b
  {
    public abstract boolean aJw();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */