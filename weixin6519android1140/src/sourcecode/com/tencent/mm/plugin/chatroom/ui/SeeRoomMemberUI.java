package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.chatroom.d.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.contact.u;
import com.tencent.mm.ui.tools.p;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SeeRoomMemberUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private static int jQP;
  private String eDs;
  private boolean eMr;
  private r ihl;
  private com.tencent.mm.storage.q jNF;
  private boolean jNm;
  private String jOR;
  private String jPg;
  private int jPh;
  private String jPi;
  private boolean jPj;
  private GridView jQB;
  private b jQI;
  private String jQJ;
  private String jQK;
  private p jQL;
  private String jQM;
  private MMEditText jQN;
  private int jQO;
  private String mTitle;
  private String username;
  private int vq;
  
  static
  {
    GMTrace.i(9166936604672L, 68299);
    jQP = 5;
    GMTrace.o(9166936604672L, 68299);
  }
  
  public SeeRoomMemberUI()
  {
    GMTrace.i(9161299460096L, 68257);
    GMTrace.o(9161299460096L, 68257);
  }
  
  protected static String a(com.tencent.mm.storage.q paramq, String paramString)
  {
    GMTrace.i(9163849596928L, 68276);
    if (paramq == null)
    {
      GMTrace.o(9163849596928L, 68276);
      return "";
    }
    paramq = paramq.fs(paramString);
    GMTrace.o(9163849596928L, 68276);
    return paramq;
  }
  
  private void a(int paramInt, final d paramd)
  {
    GMTrace.i(9163178508288L, 68271);
    int j = 0;
    Object localObject3 = "";
    Object localObject4 = "";
    String str = ab.getContext().getString(R.l.deV);
    final Object localObject1 = paramd.jMY;
    final Object localObject2 = paramd.jNa;
    final Object localObject5 = paramd.eNI;
    if ((paramInt == 63524) && (((localObject1 != null) && (!((List)localObject1).isEmpty())) || ((localObject2 != null) && (!((List)localObject2).isEmpty()))))
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.cQy), null, getString(R.l.dDm), getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9158346670080L, 68235);
          SeeRoomMemberUI.a(SeeRoomMemberUI.this, paramd.chatroomName, localObject5);
          paramAnonymousDialogInterface = new ArrayList();
          paramAnonymousDialogInterface.addAll(localObject1);
          paramAnonymousDialogInterface.addAll(localObject2);
          paramAnonymousDialogInterface = new com.tencent.mm.plugin.chatroom.d.k(SeeRoomMemberUI.k(SeeRoomMemberUI.this), paramAnonymousDialogInterface);
          at.wS().a(paramAnonymousDialogInterface, 0);
          SeeRoomMemberUI localSeeRoomMemberUI1 = SeeRoomMemberUI.this;
          SeeRoomMemberUI localSeeRoomMemberUI2 = SeeRoomMemberUI.this;
          SeeRoomMemberUI.this.getString(R.l.cUG);
          SeeRoomMemberUI.a(localSeeRoomMemberUI1, com.tencent.mm.ui.base.h.a(localSeeRoomMemberUI2, SeeRoomMemberUI.this.getString(R.l.dTe), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(9103585837056L, 67827);
              at.wS().c(paramAnonymousDialogInterface);
              GMTrace.o(9103585837056L, 67827);
            }
          }));
          GMTrace.o(9158346670080L, 68235);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9077681815552L, 67634);
          GMTrace.o(9077681815552L, 67634);
        }
      });
      GMTrace.o(9163178508288L, 68271);
      return;
    }
    at.AR();
    com.tencent.mm.storage.q localq = c.yT().gD(this.jOR);
    localObject2 = localObject4;
    localObject1 = localObject3;
    int i = j;
    if (paramInt == -116)
    {
      localObject2 = localObject4;
      localObject1 = localObject3;
      i = j;
      if (anu())
      {
        localObject2 = localObject4;
        localObject1 = localObject3;
        i = j;
        if (!bg.nm(localq.field_roomowner))
        {
          localObject1 = getString(R.l.dTk);
          localObject2 = getString(R.l.dTj);
          i = 1;
        }
      }
    }
    if (paramInt == -23)
    {
      localObject1 = getString(R.l.dTq);
      localObject2 = getString(R.l.dTp);
    }
    if (paramInt == -109)
    {
      localObject1 = getString(R.l.dTm);
      localObject2 = getString(R.l.dTl);
    }
    if (paramInt == -122)
    {
      localObject3 = getString(R.l.dTq);
      paramInt = R.l.dTo;
      localObject1 = null;
      at.AR();
      localObject4 = c.yK().TE(this.jNF.field_roomowner);
      localObject2 = localObject1;
      if (localObject4 != null)
      {
        localObject2 = localObject1;
        if ((int)((com.tencent.mm.l.a)localObject4).fTq > 0) {
          localObject2 = ((af)localObject4).field_conRemark;
        }
      }
      localObject1 = localObject2;
      if (bg.nm((String)localObject2))
      {
        localObject1 = this.jNF.field_roomowner;
        if (this.jNF != null) {
          break label597;
        }
      }
    }
    label597:
    for (localObject1 = null;; localObject1 = this.jNF.fs((String)localObject1))
    {
      localObject2 = localObject1;
      if (bg.nm((String)localObject1))
      {
        localObject2 = localObject1;
        if (localObject4 != null)
        {
          localObject2 = localObject1;
          if ((int)((com.tencent.mm.l.a)localObject4).fTq > 0) {
            localObject2 = ((x)localObject4).vj();
          }
        }
      }
      localObject1 = localObject2;
      if (bg.nm((String)localObject2)) {
        localObject1 = this.jNF.field_roomowner;
      }
      localObject2 = getString(paramInt, new Object[] { localObject1, Integer.valueOf(localq.bSs()) });
      localObject1 = localObject3;
      localObject3 = paramd.jMZ;
      if ((localObject5 == null) || (((List)localObject5).size() <= 0) || ((((List)localObject5).size() != paramd.eMK) && ((localObject3 == null) || (((List)localObject3).size() <= 0) || (paramd.eMK != ((List)localObject5).size() + ((List)localObject3).size())))) {
        break label795;
      }
      localObject4 = new LinkedList();
      paramInt = 0;
      while (paramInt < ((List)localObject5).size())
      {
        ((LinkedList)localObject4).add(((List)localObject5).get(paramInt));
        paramInt += 1;
      }
    }
    localObject2 = "";
    localObject5 = ab.getContext().getString(R.l.deV);
    localObject1 = localObject2;
    if (localObject3 != null)
    {
      localObject1 = localObject2;
      if (!((List)localObject3).isEmpty()) {
        localObject1 = getString(R.l.dww, new Object[] { bg.c(ah((List)localObject3), (String)localObject5) }) + "\n";
      }
    }
    localObject2 = localObject1;
    if (!((List)localObject4).isEmpty()) {
      localObject2 = (String)localObject1 + getString(R.l.dwx, new Object[] { bg.c(ah((List)localObject4), (String)localObject5) });
    }
    com.tencent.mm.ui.base.h.a(this, (String)localObject2, "", getString(R.l.dwr), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(9070702493696L, 67582);
        SeeRoomMemberUI.l(SeeRoomMemberUI.this);
        GMTrace.o(9070702493696L, 67582);
      }
    });
    d(paramd.chatroomName, (List)localObject4);
    GMTrace.o(9163178508288L, 68271);
    return;
    label795:
    localObject3 = paramd.jMZ;
    localObject4 = localObject2;
    if (localObject3 != null)
    {
      localObject4 = localObject2;
      if (((List)localObject3).size() > 0) {
        localObject4 = (String)localObject2 + getString(R.l.dwJ, new Object[] { bg.c(ah((List)localObject3), str) });
      }
    }
    List localList = paramd.eNH;
    localObject2 = localObject4;
    localObject3 = localObject1;
    if (localList != null)
    {
      localObject2 = localObject4;
      localObject3 = localObject1;
      if (localList.size() > 0)
      {
        localObject3 = getString(R.l.cQx);
        localObject2 = (String)localObject4 + getString(R.l.dwQ, new Object[] { bg.c(ah(localList), str) });
      }
    }
    localList = paramd.eNF;
    localObject1 = localObject2;
    localObject4 = localObject3;
    if (localList != null)
    {
      localObject1 = localObject2;
      localObject4 = localObject3;
      if (localList.size() > 0)
      {
        localObject4 = getString(R.l.cQx);
        localObject1 = (String)localObject2 + getString(R.l.dwK, new Object[] { bg.c(ah(localList), str) });
      }
    }
    localObject3 = paramd.jNa;
    if ((localObject5 == null) || (((List)localObject5).isEmpty()))
    {
      localObject2 = localObject1;
      if (localObject3 != null)
      {
        localObject2 = localObject1;
        if (((List)localObject3).size() <= 0) {}
      }
    }
    else
    {
      localObject2 = new ArrayList();
      ((List)localObject2).addAll((Collection)localObject5);
      ((List)localObject2).addAll((Collection)localObject3);
      d(paramd.chatroomName, (List)localObject5);
      paramd = (String)localObject1 + getString(R.l.dwx, new Object[] { bg.c(ah((List)localObject2), str) });
      localObject2 = paramd;
      if (localObject5 != null)
      {
        localObject2 = paramd;
        if (((List)localObject5).isEmpty()) {
          localObject2 = null;
        }
      }
    }
    if ((localObject2 != null) && (((String)localObject2).length() > 0))
    {
      if (i == 0) {
        break label1248;
      }
      com.tencent.mm.ui.base.h.a(this, (String)localObject2, (String)localObject4, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9132039995392L, 68039);
          paramAnonymousDialogInterface = SeeRoomMemberUI.this;
          SeeRoomMemberUI localSeeRoomMemberUI = SeeRoomMemberUI.this;
          SeeRoomMemberUI.k(SeeRoomMemberUI.this);
          SeeRoomMemberUI.a(paramAnonymousDialogInterface, localSeeRoomMemberUI);
          GMTrace.o(9132039995392L, 68039);
        }
      }, null);
    }
    for (;;)
    {
      localq.bSr();
      GMTrace.o(9163178508288L, 68271);
      return;
      label1248:
      com.tencent.mm.ui.base.h.b(this, (String)localObject2, (String)localObject4, true);
    }
  }
  
  private static List<String> ah(List<String> paramList)
  {
    GMTrace.i(9163581161472L, 68274);
    LinkedList localLinkedList = new LinkedList();
    if (!at.AU())
    {
      GMTrace.o(9163581161472L, 68274);
      return localLinkedList;
    }
    if (paramList == null)
    {
      GMTrace.o(9163581161472L, 68274);
      return localLinkedList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      at.AR();
      x localx = c.yK().TE(str);
      paramList = str;
      if (localx != null)
      {
        paramList = str;
        if ((int)localx.fTq != 0) {
          paramList = localx.vk();
        }
      }
      localLinkedList.add(paramList);
    }
    GMTrace.o(9163581161472L, 68274);
    return localLinkedList;
  }
  
  private void anN()
  {
    GMTrace.i(9162104766464L, 68263);
    at.AR();
    ae localae = c.yT();
    if (this.eDs == null) {}
    for (Object localObject = this.jOR;; localObject = this.eDs)
    {
      this.jNF = localae.gC((String)localObject);
      localObject = m.fi(this.jOR);
      if (this.jQI != null) {
        this.jQI.aj((List)localObject);
      }
      GMTrace.o(9162104766464L, 68263);
      return;
    }
  }
  
  private static boolean anu()
  {
    GMTrace.i(9163446943744L, 68273);
    if (bg.getInt(com.tencent.mm.k.g.ut().getValue("ChatroomGlobalSwitch"), 1) == 1)
    {
      GMTrace.o(9163446943744L, 68273);
      return true;
    }
    GMTrace.o(9163446943744L, 68273);
    return false;
  }
  
  private static int ce(Context paramContext)
  {
    GMTrace.i(9161836331008L, 68261);
    if (paramContext == null)
    {
      GMTrace.o(9161836331008L, 68261);
      return 0;
    }
    int i = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getWidth();
    int j = (int)(paramContext.getResources().getDimension(R.f.aQw) * 2.0F + paramContext.getResources().getDimension(R.f.aQy));
    i = (int)((i - paramContext.getResources().getDimension(R.f.aQt) * 1.0F) / j);
    w.i("MicroMsg.SeeRoomMemberUI", "[getWrapColNum] :%s", new Object[] { Integer.valueOf(i) });
    jQP = i;
    GMTrace.o(9161836331008L, 68261);
    return i;
  }
  
  private void d(String paramString, List<String> paramList)
  {
    GMTrace.i(9163312726016L, 68272);
    if ((paramList != null) && (paramList.size() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      while (i < paramList.size())
      {
        localLinkedList.add(paramList.get(i));
        i += 1;
      }
      paramList = "weixin://findfriend/verifycontact/" + paramString + "/";
      l.a(paramString, localLinkedList, getString(R.l.deU), true, paramList);
    }
    GMTrace.o(9163312726016L, 68272);
  }
  
  /* Error */
  private static Object invokeMethod(Object paramObject, String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    // Byte code:
    //   0: ldc2_w 865
    //   3: ldc_w 867
    //   6: invokestatic 87	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: ifnonnull +14 -> 24
    //   13: ldc2_w 865
    //   16: ldc_w 867
    //   19: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   22: aconst_null
    //   23: areturn
    //   24: aload_0
    //   25: invokevirtual 871	java/lang/Object:getClass	()Ljava/lang/Class;
    //   28: astore 4
    //   30: aload 4
    //   32: ldc_w 280
    //   35: if_acmpeq +144 -> 179
    //   38: aload 4
    //   40: aload_1
    //   41: aload_3
    //   42: invokevirtual 877	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   45: astore 5
    //   47: aload 5
    //   49: astore_1
    //   50: aload_1
    //   51: ifnull +123 -> 174
    //   54: aload_1
    //   55: iconst_1
    //   56: invokevirtual 883	java/lang/reflect/Method:setAccessible	(Z)V
    //   59: aload_1
    //   60: aload_0
    //   61: aload_2
    //   62: invokevirtual 887	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   65: astore_0
    //   66: ldc2_w 865
    //   69: ldc_w 867
    //   72: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   75: aload_0
    //   76: areturn
    //   77: astore 5
    //   79: ldc_w 414
    //   82: aload 5
    //   84: ldc -126
    //   86: iconst_0
    //   87: anewarray 280	java/lang/Object
    //   90: invokestatic 891	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload 4
    //   95: invokevirtual 894	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   98: astore 4
    //   100: goto -70 -> 30
    //   103: astore 5
    //   105: ldc_w 414
    //   108: aload 5
    //   110: ldc -126
    //   112: iconst_0
    //   113: anewarray 280	java/lang/Object
    //   116: invokestatic 891	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: goto -26 -> 93
    //   122: astore_0
    //   123: ldc_w 414
    //   126: aload_0
    //   127: ldc -126
    //   129: iconst_0
    //   130: anewarray 280	java/lang/Object
    //   133: invokestatic 891	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: aconst_null
    //   137: astore_0
    //   138: goto -72 -> 66
    //   141: astore_0
    //   142: ldc_w 414
    //   145: aload_0
    //   146: ldc -126
    //   148: iconst_0
    //   149: anewarray 280	java/lang/Object
    //   152: invokestatic 891	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: aconst_null
    //   156: astore_0
    //   157: goto -91 -> 66
    //   160: astore_0
    //   161: ldc_w 414
    //   164: aload_0
    //   165: ldc -126
    //   167: iconst_0
    //   168: anewarray 280	java/lang/Object
    //   171: invokestatic 891	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: aconst_null
    //   175: astore_0
    //   176: goto -110 -> 66
    //   179: aconst_null
    //   180: astore_1
    //   181: goto -131 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	paramObject	Object
    //   0	184	1	paramString	String
    //   0	184	2	paramArrayOfObject	Object[]
    //   0	184	3	paramArrayOfClass	Class[]
    //   28	71	4	localClass	Class
    //   45	3	5	localMethod	java.lang.reflect.Method
    //   77	6	5	localNoSuchMethodException	NoSuchMethodException
    //   103	6	5	localSecurityException	SecurityException
    // Exception table:
    //   from	to	target	type
    //   38	47	77	java/lang/NoSuchMethodException
    //   38	47	103	java/lang/SecurityException
    //   59	66	122	java/lang/IllegalAccessException
    //   59	66	141	java/lang/IllegalArgumentException
    //   59	66	160	java/lang/reflect/InvocationTargetException
  }
  
  private void n(final String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(9163044290560L, 68270);
    if (!s.fv(paramString1))
    {
      com.tencent.mm.ui.base.h.b(this, getString(R.l.dTn), getString(R.l.cUG), true);
      GMTrace.o(9163044290560L, 68270);
      return;
    }
    if (uU(paramString1))
    {
      com.tencent.mm.ui.base.h.b(this, getString(R.l.cQz), getString(R.l.cUG), true);
      GMTrace.o(9163044290560L, 68270);
      return;
    }
    paramString1 = bg.g(paramString1.split(","));
    if (paramString1 == null)
    {
      GMTrace.o(9163044290560L, 68270);
      return;
    }
    paramString1 = new d(this.jOR, paramString1, paramString2);
    getString(R.l.cUG);
    this.ihl = com.tencent.mm.ui.base.h.a(this, getString(paramInt), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(9098888216576L, 67792);
        at.wS().c(paramString1);
        GMTrace.o(9098888216576L, 67792);
      }
    });
    at.wS().a(paramString1, 0);
    GMTrace.o(9163044290560L, 68270);
  }
  
  private void uT(final String paramString)
  {
    GMTrace.i(9162641637376L, 68267);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(9162641637376L, 68267);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString);
    paramString = new com.tencent.mm.plugin.chatroom.d.g(this.jOR, localLinkedList);
    getString(R.l.cUG);
    this.ihl = com.tencent.mm.ui.base.h.a(this, getString(R.l.dSE), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(9091237806080L, 67735);
        at.wS().c(paramString);
        GMTrace.o(9091237806080L, 67735);
      }
    });
    at.wS().a(paramString, 0);
    GMTrace.o(9162641637376L, 68267);
  }
  
  private boolean uU(String paramString)
  {
    GMTrace.i(9163715379200L, 68275);
    if (bg.nl(com.tencent.mm.y.q.zE()).equals(paramString))
    {
      GMTrace.o(9163715379200L, 68275);
      return true;
    }
    Object localObject = m.fi(this.jOR);
    if (localObject == null)
    {
      GMTrace.o(9163715379200L, 68275);
      return false;
    }
    localObject = ((List)localObject).iterator();
    boolean bool = false;
    if (((Iterator)localObject).hasNext())
    {
      if (!((String)((Iterator)localObject).next()).equals(paramString)) {
        break label106;
      }
      bool = true;
    }
    label106:
    for (;;)
    {
      break;
      GMTrace.o(9163715379200L, 68275);
      return bool;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(9161970548736L, 68262);
    sq(this.mTitle + "(" + this.jPh + ")");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9077950251008L, 67636);
        SeeRoomMemberUI.this.setResult(0);
        SeeRoomMemberUI.this.finish();
        GMTrace.o(9077950251008L, 67636);
        return true;
      }
    });
    this.jQN = ((MMEditText)findViewById(R.h.bPh));
    this.jQB = ((GridView)findViewById(R.h.bmi));
    this.jQB.setNumColumns(ce(this));
    this.jQB.setColumnWidth(getResources().getDimensionPixelSize(R.f.aQt));
    com.tencent.mm.storage.q localq = this.jNF;
    String str = this.jOR;
    Object localObject = new LinkedList();
    if (!bg.nm(this.jQJ)) {
      localObject = bg.g(this.jQJ.split(","));
    }
    at.AR();
    ay localay = c.yS().CB("@t.qq.com");
    if (localay != null) {
      ((List)localObject).add(localay.name);
    }
    this.jQI = new b(this, localq, str, (List)localObject, this.jPi);
    this.jQN.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9131503124480L, 68035);
        GMTrace.o(9131503124480L, 68035);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9131368906752L, 68034);
        GMTrace.o(9131368906752L, 68034);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9131234689024L, 68033);
        SeeRoomMemberUI.c(SeeRoomMemberUI.this).uV(paramAnonymousCharSequence.toString());
        GMTrace.o(9131234689024L, 68033);
      }
    });
    this.jQB.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9106941280256L, 67852);
        paramAnonymousAdapterView = SeeRoomMemberUI.c(SeeRoomMemberUI.this).md(paramAnonymousInt);
        if (paramAnonymousAdapterView.type == 2)
        {
          w.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Add member");
          com.tencent.mm.plugin.report.service.g.ork.a(219L, 6L, 1L, true);
          SeeRoomMemberUI.d(SeeRoomMemberUI.this);
          GMTrace.o(9106941280256L, 67852);
          return;
        }
        if (paramAnonymousAdapterView.type == 3)
        {
          w.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Delete member");
          SeeRoomMemberUI.e(SeeRoomMemberUI.this);
          GMTrace.o(9106941280256L, 67852);
          return;
        }
        String str;
        if (paramAnonymousAdapterView.type == 1)
        {
          paramAnonymousAdapterView = SeeRoomMemberUI.c(SeeRoomMemberUI.this).md(paramAnonymousInt).iBi;
          if (paramAnonymousAdapterView == null)
          {
            w.e("MicroMsg.SeeRoomMemberUI", "cont is null");
            GMTrace.o(9106941280256L, 67852);
            return;
          }
          SeeRoomMemberUI.a(SeeRoomMemberUI.this, paramAnonymousAdapterView.field_username);
          paramAnonymousView = paramAnonymousAdapterView.field_nickname;
          str = SeeRoomMemberUI.a(SeeRoomMemberUI.f(SeeRoomMemberUI.this), SeeRoomMemberUI.g(SeeRoomMemberUI.this));
          if (!bg.nm(str)) {
            break label248;
          }
          SeeRoomMemberUI.b(SeeRoomMemberUI.this, paramAnonymousAdapterView.vk());
        }
        for (;;)
        {
          u.k(SeeRoomMemberUI.h(SeeRoomMemberUI.this).getText().toString(), 1, 6, paramAnonymousInt + 1);
          SeeRoomMemberUI.a(SeeRoomMemberUI.this, SeeRoomMemberUI.g(SeeRoomMemberUI.this), SeeRoomMemberUI.i(SeeRoomMemberUI.this), paramAnonymousView);
          GMTrace.o(9106941280256L, 67852);
          return;
          label248:
          SeeRoomMemberUI.b(SeeRoomMemberUI.this, str);
        }
      }
    });
    this.jQB.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9136334962688L, 68071);
        if (SeeRoomMemberUI.j(SeeRoomMemberUI.this))
        {
          paramAnonymousAdapterView = SeeRoomMemberUI.c(SeeRoomMemberUI.this).md(paramAnonymousInt).iBi;
          if (paramAnonymousAdapterView == null)
          {
            GMTrace.o(9136334962688L, 68071);
            return true;
          }
          paramAnonymousAdapterView = paramAnonymousAdapterView.field_username;
          if (SeeRoomMemberUI.f(SeeRoomMemberUI.this).field_roomowner.equals(paramAnonymousAdapterView))
          {
            GMTrace.o(9136334962688L, 68071);
            return true;
          }
          com.tencent.mm.ui.base.h.a(SeeRoomMemberUI.this, SeeRoomMemberUI.this.getString(R.l.dSG), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(9089627193344L, 67723);
              SeeRoomMemberUI.a(SeeRoomMemberUI.this, paramAnonymousInt);
              GMTrace.o(9089627193344L, 67723);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(9142374760448L, 68116);
              GMTrace.o(9142374760448L, 68116);
            }
          });
        }
        for (;;)
        {
          GMTrace.o(9136334962688L, 68071);
          return true;
          w.i("MicroMsg.SeeRoomMemberUI", "U are not a roomowner");
        }
      }
    });
    this.jQB.setAdapter(this.jQI);
    GMTrace.o(9161970548736L, 68262);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(9162775855104L, 68268);
    if ((this.ihl != null) && (this.ihl.isShowing())) {
      this.ihl.dismiss();
    }
    paramString = com.tencent.mm.h.a.dH(paramString);
    if (paramString != null)
    {
      paramString.a(this, null, null);
      GMTrace.o(9162775855104L, 68268);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if ((paramk.getType() == 179) && (paramInt2 == -66)) {
        com.tencent.mm.ui.base.h.b(this, getString(R.l.dmz), getString(R.l.cUG), true);
      }
      if (paramk.getType() == 120)
      {
        a(paramInt2, (d)paramk);
        GMTrace.o(9162775855104L, 68268);
        return;
      }
      if (paramk.getType() == 610)
      {
        com.tencent.mm.ui.base.h.b(this, getString(R.l.dDx), getString(R.l.cUG), true);
        GMTrace.o(9162775855104L, 68268);
      }
    }
    else if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      switch (paramk.getType())
      {
      }
    }
    for (;;)
    {
      if (this.jNF != null) {
        sq(this.mTitle + "(" + this.jNF.FT().size() + ")");
      }
      GMTrace.o(9162775855104L, 68268);
      return;
      anN();
      continue;
      a(paramInt2, (d)paramk);
      anN();
      continue;
      com.tencent.mm.ui.base.h.b(this, getString(R.l.dDy), null, true);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9162507419648L, 68266);
    int i = R.i.cFE;
    GMTrace.o(9162507419648L, 68266);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(9162910072832L, 68269);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(9162910072832L, 68269);
      return;
      if (paramIntent == null)
      {
        GMTrace.o(9162910072832L, 68269);
        return;
      }
      String str = paramIntent.getStringExtra("Select_Contact");
      if (!s.fv(str))
      {
        com.tencent.mm.ui.base.h.b(this, getString(R.l.dTn), getString(R.l.cUG), true);
        GMTrace.o(9162910072832L, 68269);
        return;
      }
      if (uU(str))
      {
        com.tencent.mm.ui.base.h.b(this, getString(R.l.cQz), getString(R.l.cUG), true);
        GMTrace.o(9162910072832L, 68269);
        return;
      }
      if (bg.g(str.split(",")) == null)
      {
        GMTrace.o(9162910072832L, 68269);
        return;
      }
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      at.AR();
      com.tencent.mm.storage.q localq = c.yT().gC(this.jOR);
      if (localq != null)
      {
        if (localq.bSr() == 2)
        {
          com.tencent.mm.pluginsdk.ui.applet.e.b(this.vKB, getString(R.l.dSh), getString(R.l.dQc), getString(R.l.cUs), new o.a()
          {
            public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(9147206598656L, 68152);
              if (paramAnonymousBoolean) {
                SeeRoomMemberUI.a(SeeRoomMemberUI.this, paramIntent, paramAnonymousString, R.l.dDG);
              }
              GMTrace.o(9147206598656L, 68152);
            }
          });
          GMTrace.o(9162910072832L, 68269);
          return;
        }
        n(str, null, R.l.cQF);
        GMTrace.o(9162910072832L, 68269);
        return;
        if (paramIntent == null)
        {
          GMTrace.o(9162910072832L, 68269);
          return;
        }
        uT(paramIntent.getStringExtra("Select_Contact"));
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(9161702113280L, 68260);
    super.onConfigurationChanged(paramConfiguration);
    this.jQB.setNumColumns(ce(this));
    GMTrace.o(9161702113280L, 68260);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9161433677824L, 68258);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.g.ork.a(219L, 2L, 1L, true);
    at.wS().a(990, this);
    at.wS().a(179, this);
    at.wS().a(120, this);
    at.wS().a(610, this);
    this.jOR = getIntent().getStringExtra("RoomInfo_Id");
    this.eDs = getIntent().getStringExtra("Chat_User");
    this.jQK = getIntent().getStringExtra("Chatroom_member_list");
    this.eMr = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.jNm = getIntent().getBooleanExtra("Is_Lbsroom", false);
    this.jPj = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.jPi = getIntent().getStringExtra("room_owner_name");
    this.mTitle = getIntent().getStringExtra("Add_address_titile");
    at.AR();
    ae localae = c.yT();
    if (this.eDs == null)
    {
      paramBundle = this.jOR;
      this.jNF = localae.gC(paramBundle);
      this.jPh = getIntent().getIntExtra("room_member_count", 0);
      this.jPg = getIntent().getStringExtra("room_name");
      this.vq = getIntent().getIntExtra("offset", 0);
      this.jQO = getIntent().getIntExtra("first_pos", 0);
      MP();
      if (this.jQI != null)
      {
        anN();
        paramBundle = this.jQB;
        if (this.jQO * jQP >= this.jQI.getCount()) {
          break label361;
        }
      }
    }
    label361:
    for (int i = this.jQO * jQP;; i = this.jQI.getCount() - 1)
    {
      paramBundle.setSelection(i);
      this.jQB.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9075936985088L, 67621);
          if (Build.VERSION.SDK_INT >= 19)
          {
            SeeRoomMemberUI.b(SeeRoomMemberUI.this).scrollListBy(SeeRoomMemberUI.a(SeeRoomMemberUI.this));
            GMTrace.o(9075936985088L, 67621);
            return;
          }
          GridView localGridView = SeeRoomMemberUI.b(SeeRoomMemberUI.this);
          int i = -SeeRoomMemberUI.a(SeeRoomMemberUI.this);
          int j = -SeeRoomMemberUI.a(SeeRoomMemberUI.this);
          Class localClass1 = Integer.TYPE;
          Class localClass2 = Integer.TYPE;
          SeeRoomMemberUI.a(localGridView, "trackMotionScroll", new Object[] { Integer.valueOf(i), Integer.valueOf(j) }, new Class[] { localClass1, localClass2 });
          GMTrace.o(9075936985088L, 67621);
        }
      }, 100L);
      GMTrace.o(9161433677824L, 68258);
      return;
      paramBundle = this.eDs;
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9162373201920L, 68265);
    at.wS().b(990, this);
    at.wS().b(179, this);
    at.wS().b(120, this);
    at.wS().b(610, this);
    if ((this.ihl != null) && (this.ihl.isShowing())) {
      this.ihl.dismiss();
    }
    super.onDestroy();
    GMTrace.o(9162373201920L, 68265);
  }
  
  protected void onPause()
  {
    GMTrace.i(9162238984192L, 68264);
    super.onPause();
    if (this.jQL != null) {
      this.jQL.cit();
    }
    GMTrace.o(9162238984192L, 68264);
  }
  
  public void onResume()
  {
    GMTrace.i(9161567895552L, 68259);
    super.onResume();
    if (this.jQI != null) {
      this.jQI.uV(this.jQN.getText().toString());
    }
    GMTrace.o(9161567895552L, 68259);
  }
  
  private static final class a
  {
    x iBi;
    int type;
    
    public a(int paramInt, x paramx)
    {
      GMTrace.i(9086942838784L, 67703);
      this.type = paramInt;
      this.iBi = paramx;
      GMTrace.o(9086942838784L, 67703);
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    private List<SeeRoomMemberUI.a> eNC;
    private List<String> iVA;
    private String jNA;
    private com.tencent.mm.storage.q jNF;
    public String jQT;
    private boolean jQU;
    private String jQV;
    private List<SeeRoomMemberUI.a> jQW;
    private c jQm;
    private Context mContext;
    
    public b(com.tencent.mm.storage.q paramq, String paramString1, List<String> paramList, String paramString2)
    {
      GMTrace.i(9099290869760L, 67795);
      this.jQU = false;
      this.jQV = null;
      this.eNC = new ArrayList();
      this.jNF = paramString1;
      this.jNA = paramList;
      this.iVA = paramString2;
      String str;
      this.jQV = str;
      this.mContext = paramq;
      this.jQm = at.AR();
      aj(m.fi(paramList));
      GMTrace.o(9099290869760L, 67795);
    }
    
    public final void aj(List<String> paramList)
    {
      GMTrace.i(9099425087488L, 67796);
      if (paramList == null)
      {
        GMTrace.o(9099425087488L, 67796);
        return;
      }
      this.eNC.clear();
      int i = 0;
      if (i < paramList.size())
      {
        x localx = c.yK().TE((String)paramList.get(i));
        if ((localx != null) && (localx.field_username.equals(this.jQV))) {
          this.eNC.add(0, new SeeRoomMemberUI.a(1, localx));
        }
        for (;;)
        {
          i += 1;
          break;
          this.eNC.add(new SeeRoomMemberUI.a(1, localx));
        }
      }
      this.eNC.add(new SeeRoomMemberUI.a(2, null));
      if (SeeRoomMemberUI.j(SeeRoomMemberUI.this)) {
        this.eNC.add(new SeeRoomMemberUI.a(3, null));
      }
      this.jQW = this.eNC;
      notifyDataSetChanged();
      GMTrace.o(9099425087488L, 67796);
    }
    
    public final int getCount()
    {
      GMTrace.i(9099961958400L, 67800);
      int i = this.eNC.size();
      GMTrace.o(9099961958400L, 67800);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9100096176128L, 67801);
      long l = paramInt;
      GMTrace.o(9100096176128L, 67801);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9099693522944L, 67798);
      View localView;
      SeeRoomMemberUI.c localc;
      String str;
      if (paramView == null)
      {
        localView = View.inflate(this.mContext, R.i.cFD, null);
        localc = new SeeRoomMemberUI.c();
        localc.hqG = ((ImageView)localView.findViewById(R.h.cbi));
        localc.jtr = ((TextView)localView.findViewById(R.h.cbk));
        paramView = (WindowManager)this.mContext.getSystemService("window");
        localc.jtr.setMaxWidth(paramView.getDefaultDisplay().getWidth() * 2 / 3);
        localView.setTag(localc);
        paramView = (SeeRoomMemberUI.a)this.eNC.get(paramInt);
        if ((paramView == null) || (paramView.type != 1)) {
          break label326;
        }
        x localx = paramView.iBi;
        a.b.a(localc.hqG, localx.field_username);
        str = SeeRoomMemberUI.a(this.jNF, localx.field_username);
        if (bg.nm(localx.field_conRemark)) {
          break label320;
        }
        paramViewGroup = localx.field_conRemark;
        label183:
        paramView = paramViewGroup;
        if (bg.nm(paramViewGroup)) {
          paramView = localx.vj();
        }
        paramViewGroup = paramView;
        if (str != null)
        {
          paramViewGroup = paramView;
          if (!str.equals(""))
          {
            paramViewGroup = paramView;
            if (!paramView.equals(str)) {
              paramViewGroup = str + "( " + paramView + " )";
            }
          }
        }
        localc.jtr.setVisibility(0);
        localc.jtr.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, paramViewGroup, localc.jtr.getTextSize()));
      }
      for (;;)
      {
        GMTrace.o(9099693522944L, 67798);
        return localView;
        localc = (SeeRoomMemberUI.c)paramView.getTag();
        localView = paramView;
        break;
        label320:
        paramViewGroup = str;
        break label183;
        label326:
        if ((paramView != null) && (paramView.type == 2))
        {
          localc.jtr.setVisibility(4);
          localc.hqG.setImageResource(R.g.aTZ);
        }
        else if ((paramView != null) && (paramView.type == 3))
        {
          localc.jtr.setVisibility(4);
          localc.hqG.setImageResource(R.g.aUa);
        }
      }
    }
    
    public final SeeRoomMemberUI.a md(int paramInt)
    {
      GMTrace.i(9099559305216L, 67797);
      SeeRoomMemberUI.a locala = (SeeRoomMemberUI.a)this.eNC.get(paramInt);
      GMTrace.o(9099559305216L, 67797);
      return locala;
    }
    
    public final void uV(String paramString)
    {
      GMTrace.i(9099827740672L, 67799);
      this.jQU = true;
      this.jQT = paramString;
      ArrayList localArrayList = new ArrayList();
      if (!bg.nm(paramString))
      {
        Iterator localIterator = this.jQW.iterator();
        while (localIterator.hasNext())
        {
          SeeRoomMemberUI.a locala = (SeeRoomMemberUI.a)localIterator.next();
          if ((locala != null) && (locala.iBi != null) && (locala.type == 1))
          {
            Object localObject = locala.iBi;
            if ((((af)localObject).field_conRemark != null) && (((af)localObject).field_conRemark.toUpperCase().contains(paramString.toUpperCase())))
            {
              localArrayList.add(locala);
            }
            else if ((!bg.nm(SeeRoomMemberUI.a(this.jNF, ((af)localObject).field_username))) && (SeeRoomMemberUI.a(this.jNF, ((af)localObject).field_username).contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).vj() != null) && (((x)localObject).vj().toUpperCase().contains(paramString.toUpperCase())))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).qR() != null) && (((x)localObject).qR().toUpperCase().contains(paramString.toUpperCase())))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).qQ() != null) && (((x)localObject).qQ().contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((af)localObject).field_username != null) && (((af)localObject).field_username.contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if (!com.tencent.mm.l.a.eE(((af)localObject).field_type))
            {
              at.AR();
              localObject = c.yL().CC(((af)localObject).field_username);
              if ((localObject != null) && (((bb)localObject).field_conRemark != null) && (((bb)localObject).field_conRemark.toUpperCase().contains(paramString.toUpperCase()))) {
                localArrayList.add(locala);
              }
            }
          }
        }
        w.i("MicroMsg.SeeRoomMemberUI", "[setMemberListBySearch]");
      }
      for (this.eNC = localArrayList;; this.eNC = this.jQW)
      {
        notifyDataSetChanged();
        GMTrace.o(9099827740672L, 67799);
        return;
      }
    }
  }
  
  private static final class c
  {
    public ImageView hqG;
    public TextView jtr;
    
    public c()
    {
      GMTrace.i(9152575307776L, 68192);
      GMTrace.o(9152575307776L, 68192);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\SeeRoomMemberUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */