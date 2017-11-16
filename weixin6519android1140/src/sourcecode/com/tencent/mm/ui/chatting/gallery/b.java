package com.tencent.mm.ui.chatting.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.c.a;
import com.tencent.mm.ao.f;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.l.a;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.base.v;
import com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

@SuppressLint({"UseSparseArrays"})
public final class b
  extends v
{
  public static long juT;
  public static boolean txk;
  public c wKA;
  boolean wKB;
  protected boolean wKC;
  private ArrayList<au> wKD;
  public ImageGalleryUI wKs;
  protected a wKt;
  private String wKu;
  boolean wKv;
  public boolean wKw;
  public d wKx;
  public i wKy;
  public h wKz;
  
  static
  {
    GMTrace.i(2419811418112L, 18029);
    juT = -1L;
    txk = false;
    GMTrace.o(2419811418112L, 18029);
  }
  
  public b(ImageGalleryUI paramImageGalleryUI, long paramLong1, String paramString1, boolean paramBoolean1, long paramLong2, boolean paramBoolean2, String paramString2, Boolean paramBoolean)
  {
    GMTrace.i(2414040055808L, 17986);
    this.wKv = true;
    this.wKw = false;
    this.wKC = true;
    this.wKD = new ArrayList();
    String str = "MicroMsg.ImageGalleryAdapter, invalid argument, context = " + paramImageGalleryUI + ", currentMsgId = " + paramLong1 + ", talker = " + paramString1 + ", stack = " + bg.bQW();
    if ((paramImageGalleryUI != null) && (paramLong1 > 0L) && (paramString1 != null) && (paramString1.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(str, bool);
      this.wKs = paramImageGalleryUI;
      txk = paramBoolean1;
      juT = paramLong2;
      this.wKt = new a(paramLong1, paramString1, this, paramBoolean);
      this.wKw = paramBoolean2;
      this.wKu = paramString2;
      this.wKx = new d(this);
      this.wKy = new i(this);
      this.wKz = new h(this);
      GMTrace.o(2414040055808L, 17986);
      return;
    }
  }
  
  public static boolean a(Context paramContext, au paramau, boolean paramBoolean)
  {
    GMTrace.i(15333838553088L, 114246);
    if (paramau == null)
    {
      GMTrace.o(15333838553088L, 114246);
      return false;
    }
    r localr = com.tencent.mm.modelvideo.o.Nh().mh(paramau.field_imgPath);
    boolean bool = false;
    if (localr != null)
    {
      int i = 0;
      if (com.tencent.mm.y.s.eb(localr.Nq())) {
        i = m.fk(localr.Nq());
      }
      bool = localr.Nw();
      g.ork.a(106L, 216L, 1L, false);
      g.ork.i(12084, new Object[] { Integer.valueOf(localr.gsL), Integer.valueOf(localr.hcv * 1000), Integer.valueOf(0), Integer.valueOf(2), localr.Nq(), Integer.valueOf(i), r.mg(localr.Nt()), Long.valueOf(localr.hcs) });
    }
    if (!bool)
    {
      w.w("MicroMsg.ImageGalleryAdapter", "do export video but video had not download finish.");
      if (paramBoolean) {
        Toast.makeText(paramContext, paramContext.getString(R.l.egt), 1).show();
      }
      GMTrace.o(15333838553088L, 114246);
      return false;
    }
    com.tencent.mm.modelvideo.o.Nh();
    paramau = t.mx(com.tencent.mm.modelvideo.s.mk(paramau.field_imgPath));
    if (bg.nm(paramau))
    {
      if (paramBoolean) {
        Toast.makeText(paramContext, paramContext.getString(R.l.egt), 1).show();
      }
      GMTrace.o(15333838553088L, 114246);
      return false;
    }
    if (paramBoolean) {
      Toast.makeText(paramContext, paramContext.getString(R.l.egu, new Object[] { paramau }), 1).show();
    }
    com.tencent.mm.pluginsdk.ui.tools.k.b(paramau, paramContext);
    GMTrace.o(15333838553088L, 114246);
    return true;
  }
  
  public static boolean a(au paramau, com.tencent.mm.ao.d paramd)
  {
    GMTrace.i(2415650668544L, 17998);
    if ((paramau == null) || (paramd == null))
    {
      GMTrace.o(2415650668544L, 17998);
      return false;
    }
    boolean bool = com.tencent.mm.ao.n.Ja().a(paramd.gGR, paramau.field_msgId, 1);
    GMTrace.o(2415650668544L, 17998);
    return bool;
  }
  
  public static boolean aX(au paramau)
  {
    GMTrace.i(2414845362176L, 17992);
    if (paramau == null)
    {
      GMTrace.o(2414845362176L, 17992);
      return false;
    }
    if ((paramau.field_type == 3) || (paramau.field_type == 39) || (paramau.field_type == 13))
    {
      GMTrace.o(2414845362176L, 17992);
      return true;
    }
    GMTrace.o(2414845362176L, 17992);
    return false;
  }
  
  public static boolean aY(au paramau)
  {
    GMTrace.i(2414979579904L, 17993);
    if (paramau == null)
    {
      GMTrace.o(2414979579904L, 17993);
      return false;
    }
    if (be(paramau))
    {
      GMTrace.o(2414979579904L, 17993);
      return false;
    }
    if ((paramau.field_type == 43) || (paramau.field_type == 44) || (paramau.field_type == 62))
    {
      GMTrace.o(2414979579904L, 17993);
      return true;
    }
    GMTrace.o(2414979579904L, 17993);
    return false;
  }
  
  public static boolean aZ(au paramau)
  {
    GMTrace.i(2415113797632L, 17994);
    if (paramau == null)
    {
      GMTrace.o(2415113797632L, 17994);
      return false;
    }
    if (paramau.field_type == 62)
    {
      GMTrace.o(2415113797632L, 17994);
      return true;
    }
    GMTrace.o(2415113797632L, 17994);
    return false;
  }
  
  public static int b(au paramau, com.tencent.mm.ao.d paramd)
  {
    GMTrace.i(2417529716736L, 18012);
    if (paramau.field_isSend == 1)
    {
      if (paramd.II())
      {
        paramau = com.tencent.mm.ao.e.a(paramd);
        if ((paramau != null) && (paramau.gGR > 0L) && (paramau.IH()) && (com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l(paramau.gGS, "", ""))))
        {
          GMTrace.o(2417529716736L, 18012);
          return 1;
        }
      }
      GMTrace.o(2417529716736L, 18012);
      return 0;
    }
    if (paramd.IH())
    {
      if (paramd.II())
      {
        paramau = com.tencent.mm.ao.e.a(paramd);
        if ((paramau != null) && (paramau.gGR > 0L) && (paramau.IH()) && (com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l(paramau.gGS, "", ""))))
        {
          GMTrace.o(2417529716736L, 18012);
          return 1;
        }
      }
      GMTrace.o(2417529716736L, 18012);
      return 0;
    }
    GMTrace.o(2417529716736L, 18012);
    return 0;
  }
  
  public static boolean b(Context paramContext, au paramau, boolean paramBoolean)
  {
    GMTrace.i(15333972770816L, 114247);
    if (bb(paramau)) {}
    for (Object localObject = bh(paramau); (localObject == null) || (((String)localObject).length() == 0); localObject = d.a(paramau, (com.tencent.mm.ao.d)localObject, false))
    {
      w.e("MicroMsg.ImageGalleryAdapter", "doRestransmitMsg fail, bigImgPath is null, msgLocalId = " + paramau.field_msgId);
      if (paramBoolean) {
        Toast.makeText(paramContext, paramContext.getString(R.l.dUI), 1).show();
      }
      GMTrace.o(15333972770816L, 114247);
      return false;
      if ((paramau == null) || (paramau.field_msgId == 0L))
      {
        w.e("MicroMsg.ImageGalleryAdapter", "msg is null");
        if (paramBoolean) {
          Toast.makeText(paramContext, paramContext.getString(R.l.dUI), 1).show();
        }
        GMTrace.o(15333972770816L, 114247);
        return false;
      }
      localObject = d.bm(paramau);
      if ((localObject == null) || (((com.tencent.mm.ao.d)localObject).gGR == 0L))
      {
        StringBuilder localStringBuilder = new StringBuilder("doRestransmitMsg fail, msgLocalId = ");
        if (paramau == null)
        {
          paramau = "null";
          localStringBuilder = localStringBuilder.append(paramau).append(", imgLocalId = ");
          if (localObject != null) {
            break label253;
          }
        }
        label253:
        for (paramau = "null";; paramau = Long.valueOf(((com.tencent.mm.ao.d)localObject).gGR))
        {
          w.e("MicroMsg.ImageGalleryAdapter", paramau);
          if (paramBoolean) {
            Toast.makeText(paramContext, paramContext.getString(R.l.dUI), 1).show();
          }
          GMTrace.o(15333972770816L, 114247);
          return false;
          paramau = Long.valueOf(paramau.field_msgId);
          break;
        }
      }
    }
    if (!com.tencent.mm.platformtools.d.a((String)localObject, paramContext, paramBoolean, R.l.dmf))
    {
      if (paramBoolean) {
        Toast.makeText(paramContext, paramContext.getString(R.l.dUI), 1).show();
      }
      GMTrace.o(15333972770816L, 114247);
      return false;
    }
    GMTrace.o(15333972770816L, 114247);
    return true;
  }
  
  public static boolean ba(au paramau)
  {
    GMTrace.i(2415248015360L, 17995);
    if (paramau == null)
    {
      GMTrace.o(2415248015360L, 17995);
      return false;
    }
    if (paramau.field_type == 49)
    {
      GMTrace.o(2415248015360L, 17995);
      return true;
    }
    GMTrace.o(2415248015360L, 17995);
    return false;
  }
  
  public static boolean bb(au paramau)
  {
    GMTrace.i(2415382233088L, 17996);
    if (paramau == null)
    {
      GMTrace.o(2415382233088L, 17996);
      return false;
    }
    if (paramau.field_type == 268435505)
    {
      GMTrace.o(2415382233088L, 17996);
      return true;
    }
    GMTrace.o(2415382233088L, 17996);
    return false;
  }
  
  public static b bd(au paramau)
  {
    GMTrace.i(2416053321728L, 18001);
    b localb = b.wKX;
    if (paramau == null) {
      localb = b.wKX;
    }
    if (bb(paramau))
    {
      paramau = b.wLb;
      GMTrace.o(2416053321728L, 18001);
      return paramau;
    }
    if (aX(paramau))
    {
      paramau = b.wKY;
      GMTrace.o(2416053321728L, 18001);
      return paramau;
    }
    if (be(paramau))
    {
      paramau = b.wLa;
      GMTrace.o(2416053321728L, 18001);
      return paramau;
    }
    if (aY(paramau))
    {
      paramau = b.wKZ;
      GMTrace.o(2416053321728L, 18001);
      return paramau;
    }
    if (aZ(paramau))
    {
      paramau = b.wKZ;
      GMTrace.o(2416053321728L, 18001);
      return paramau;
    }
    paramau = b.wKX;
    GMTrace.o(2416053321728L, 18001);
    return paramau;
  }
  
  private static boolean be(au paramau)
  {
    GMTrace.i(2416187539456L, 18002);
    if (paramau != null)
    {
      paramau = t.mw(paramau.field_imgPath);
      if ((paramau != null) && (paramau.hcE != null) && ((!bg.nm(paramau.hcE.gkI)) || (paramau.hcE.ulk > 0) || (!bg.nm(paramau.hcE.gkL)) || (!bg.nm(paramau.hcE.gkM)) || (!bg.nm(paramau.hcE.gkK)) || (!bg.nm(paramau.hcE.gkN)) || (!bg.nm(paramau.hcE.gkO)) || (!bg.nm(paramau.hcE.gkP))))
      {
        GMTrace.o(2416187539456L, 18002);
        return true;
      }
    }
    GMTrace.o(2416187539456L, 18002);
    return false;
  }
  
  public static String bh(au paramau)
  {
    Object localObject1 = null;
    GMTrace.i(2417261281280L, 18010);
    Object localObject2 = f.a.eS(paramau.field_content);
    if (localObject2 == null)
    {
      GMTrace.o(2417261281280L, 18010);
      return null;
    }
    paramau = (au)localObject1;
    if (((f.a)localObject2).eAE != null)
    {
      paramau = (au)localObject1;
      if (((f.a)localObject2).eAE.length() > 0)
      {
        localObject2 = an.afP().Op(((f.a)localObject2).eAE);
        paramau = (au)localObject1;
        if (localObject2 != null) {
          paramau = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
        }
      }
    }
    GMTrace.o(2417261281280L, 18010);
    return paramau;
  }
  
  public static boolean c(Context paramContext, List<au> paramList)
  {
    GMTrace.i(2416590192640L, 18005);
    if ((paramContext == null) || (paramList == null) || (paramList.size() <= 0))
    {
      GMTrace.o(2416590192640L, 18005);
      return false;
    }
    boolean bool1;
    int i;
    label58:
    au localau;
    boolean bool2;
    if (paramList.size() <= 1)
    {
      bool1 = true;
      paramList = paramList.iterator();
      i = 0;
      if (!paramList.hasNext()) {
        break label126;
      }
      localau = (au)paramList.next();
      if (!aY(localau)) {
        break label114;
      }
      bool2 = a(paramContext, localau, bool1);
      label95:
      if ((i != 0) || (!bool2)) {
        break label196;
      }
      i = 1;
    }
    label114:
    label126:
    label196:
    for (;;)
    {
      break label58;
      bool1 = false;
      break;
      bool2 = b(paramContext, localau, bool1);
      break label95;
      if ((i == 0) && (!bool1)) {
        Toast.makeText(paramContext, paramContext.getString(R.l.dUJ), 1).show();
      }
      for (;;)
      {
        GMTrace.o(2416590192640L, 18005);
        return true;
        if ((i != 0) && (!bool1)) {
          Toast.makeText(paramContext, paramContext.getString(R.l.dsg, new Object[] { com.tencent.mm.compatible.util.e.fRZ }), 1).show();
        }
      }
    }
  }
  
  public final au Dd(int paramInt)
  {
    GMTrace.i(2414576926720L, 17990);
    au localau = this.wKt.Do(paramInt);
    GMTrace.o(2414576926720L, 17990);
    return localau;
  }
  
  public final void De(int paramInt)
  {
    GMTrace.i(2415784886272L, 17999);
    au localau = Dd(paramInt);
    Object localObject = bd(localau);
    switch (2.wKH[localObject.ordinal()])
    {
    default: 
      bg(localau);
      GMTrace.o(2415784886272L, 17999);
      return;
    case 1: 
    case 2: 
      bf(localau);
      GMTrace.o(2415784886272L, 17999);
      return;
    }
    localObject = bh(localau);
    Intent localIntent = new Intent(this.wKs, MsgRetransmitUI.class);
    localIntent.putExtra("Retr_File_Name", (String)localObject);
    localIntent.putExtra("Retr_Msg_Id", localau.field_msgId);
    localIntent.putExtra("Retr_Msg_Type", 16);
    localIntent.putExtra("Retr_Msg_content", localau.field_content);
    localIntent.putExtra("Retr_Compress_Type", 0);
    this.wKs.startActivity(localIntent);
    GMTrace.o(2415784886272L, 17999);
  }
  
  public final void Df(int paramInt)
  {
    GMTrace.i(2415919104000L, 18000);
    au localau = Dd(paramInt);
    Object localObject = bd(localau);
    switch (2.wKH[localObject.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(2415919104000L, 18000);
      return;
      localObject = new Intent(this.wKs, ChattingSendDataToDeviceUI.class);
      ((Intent)localObject).putExtra("Retr_Msg_Id", localau.field_msgId);
      this.wKs.startActivity((Intent)localObject);
    }
  }
  
  public final void Dg(int paramInt)
  {
    GMTrace.i(2416992845824L, 18008);
    au localau = Dd(paramInt);
    cf localcf = new cf();
    com.tencent.mm.pluginsdk.model.e.a(localcf, localau);
    localcf.eDv.activity = this.wKs;
    localcf.eDv.eDC = 44;
    com.tencent.mm.sdk.b.a.vgX.m(localcf);
    if (localcf.eDw.ret == 0)
    {
      if (localau.bTH()) {
        com.tencent.mm.ui.chatting.a.a(a.c.wqy, a.d.wqE, localau, 0);
      }
      com.tencent.mm.modelstat.b.gWv.t(localau);
    }
    GMTrace.o(2416992845824L, 18008);
  }
  
  public final View Dh(int paramInt)
  {
    GMTrace.i(2418335023104L, 18018);
    View localView3 = super.Cd(paramInt);
    if (localView3 == null)
    {
      w.e("MicroMsg.ImageGalleryAdapter", "position : %s getVideoViewByPosition is null", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(2418335023104L, 18018);
      return null;
    }
    View localView2 = localView3.findViewById(R.h.cke);
    View localView1 = localView2;
    if (localView2 == null) {
      localView1 = localView3.findViewById(R.h.ckd);
    }
    if ((localView1 == null) || (localView1.getVisibility() == 8))
    {
      GMTrace.o(2418335023104L, 18018);
      return null;
    }
    GMTrace.o(2418335023104L, 18018);
    return localView1;
  }
  
  public final void Di(int paramInt)
  {
    GMTrace.i(2418469240832L, 18019);
    this.wKy.i(Dd(paramInt), paramInt);
    GMTrace.o(2418469240832L, 18019);
  }
  
  public final void Dj(int paramInt)
  {
    GMTrace.i(2418603458560L, 18020);
    this.wKy.j(Dd(paramInt), paramInt);
    GMTrace.o(2418603458560L, 18020);
  }
  
  public final void Dk(int paramInt)
  {
    GMTrace.i(2419006111744L, 18023);
    this.wKy.Dc(paramInt);
    GMTrace.o(2419006111744L, 18023);
  }
  
  public final void Dl(int paramInt)
  {
    GMTrace.i(2419274547200L, 18025);
    au localau = Dd(paramInt);
    if ((localau == null) || (!aX(localau)))
    {
      GMTrace.o(2419274547200L, 18025);
      return;
    }
    Object localObject = this.wKx;
    com.tencent.mm.ao.d locald = d.bm(localau);
    if ((locald == null) || (localau == null))
    {
      GMTrace.o(2419274547200L, 18025);
      return;
    }
    if (k.cfV().fk(localau.field_msgId))
    {
      localObject = k.cfV();
      ((k)localObject).wOc.remove(Long.valueOf(localau.field_msgId));
      com.tencent.mm.ao.n.Ja().a(locald.gGR, localau.field_msgId, (c.a)localObject);
      com.tencent.mm.ao.n.Ja().f(locald.gGR, localau.field_msgId);
      GMTrace.o(2419274547200L, 18025);
      return;
    }
    com.tencent.mm.ao.n.Ja().a(locald.gGR, localau.field_msgId, (c.a)localObject);
    com.tencent.mm.ao.n.Ja().f(locald.gGR, localau.field_msgId);
    GMTrace.o(2419274547200L, 18025);
  }
  
  public final void Dm(int paramInt)
  {
    GMTrace.i(2419408764928L, 18026);
    this.wKz.Ds(paramInt);
    GMTrace.o(2419408764928L, 18026);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(2414174273536L, 17987);
    if ((this.wKx != null) && (aX(Dd(paramInt)))) {
      this.wKx.wLL.V(paramInt);
    }
    GMTrace.o(2414174273536L, 17987);
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    GMTrace.i(2419542982656L, 18027);
    paramViewGroup.removeView((View)paramObject);
    super.a(paramViewGroup, paramInt, paramObject);
    GMTrace.o(2419542982656L, 18027);
  }
  
  public final void af(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2418066587648L, 18016);
    this.wKx.af(paramInt, paramBoolean);
    GMTrace.o(2418066587648L, 18016);
  }
  
  public final int asx()
  {
    GMTrace.i(2414442708992L, 17989);
    int i = this.wKt.gQB;
    GMTrace.o(2414442708992L, 17989);
    return i;
  }
  
  public final boolean bc(au paramau)
  {
    GMTrace.i(2415516450816L, 17997);
    if (paramau == null)
    {
      GMTrace.o(2415516450816L, 17997);
      return false;
    }
    com.tencent.mm.ao.d locald = f(paramau, false);
    if (locald != null)
    {
      if ((paramau == null) || (locald == null))
      {
        GMTrace.o(2415516450816L, 17997);
        return false;
      }
      if ((com.tencent.mm.ao.n.Ja().a(locald.gGR, paramau.field_msgId, 0)) || (a(paramau, locald)))
      {
        GMTrace.o(2415516450816L, 17997);
        return true;
      }
      GMTrace.o(2415516450816L, 17997);
      return false;
    }
    paramau = i.br(paramau);
    if (paramau != null)
    {
      if (paramau == null)
      {
        GMTrace.o(2415516450816L, 17997);
        return false;
      }
      int i = paramau.status;
      int j = t.f(paramau);
      if (((i == 112) || (i == 122)) && (j < 100)) {}
      for (boolean bool = true;; bool = false)
      {
        w.i("MicroMsg.ImageGalleryAdapter", "it is video downloading %b, status %d, download progress %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
        GMTrace.o(2415516450816L, 17997);
        return bool;
      }
    }
    GMTrace.o(2415516450816L, 17997);
    return false;
  }
  
  public final void bf(au paramau)
  {
    GMTrace.i(2416321757184L, 18003);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      u.fo(this.wKs);
      GMTrace.o(2416321757184L, 18003);
      return;
    }
    r localr = t.mw(paramau.field_imgPath);
    if (localr == null)
    {
      w.e("MicroMsg.ImageGalleryAdapter", "videoInfo should not be null");
      GMTrace.o(2416321757184L, 18003);
      return;
    }
    Intent localIntent = new Intent(this.wKs, MsgRetransmitUI.class);
    localIntent.putExtra("Retr_length", localr.hcv);
    localIntent.putExtra("Retr_File_Name", paramau.field_imgPath);
    localIntent.putExtra("Retr_video_isexport", localr.hcz);
    if (aZ(paramau)) {}
    for (int i = 11;; i = 1)
    {
      localIntent.putExtra("Retr_Msg_Type", i);
      localIntent.putExtra("Retr_Msg_Id", paramau.field_msgId);
      localIntent.putExtra("Retr_From", "gallery");
      this.wKs.startActivity(localIntent);
      GMTrace.o(2416321757184L, 18003);
      return;
    }
  }
  
  public final void bg(au paramau)
  {
    GMTrace.i(2416455974912L, 18004);
    com.tencent.mm.ao.d locald = d.bm(paramau);
    if ((paramau == null) || (paramau.field_msgId == 0L) || (locald == null) || (locald.gGR == 0L))
    {
      localObject = new StringBuilder("doRestransmitMsg fail, msgLocalId = ");
      if (paramau == null)
      {
        paramau = "null";
        localObject = ((StringBuilder)localObject).append(paramau).append(", imgLocalId = ");
        if (locald != null) {
          break label117;
        }
      }
      label117:
      for (paramau = "null";; paramau = Long.valueOf(locald.gGR))
      {
        w.e("MicroMsg.ImageGalleryAdapter", paramau);
        GMTrace.o(2416455974912L, 18004);
        return;
        paramau = Long.valueOf(paramau.field_msgId);
        break;
      }
    }
    Object localObject = d.a(paramau, locald, false);
    if ((localObject == null) || (((String)localObject).length() == 0))
    {
      w.e("MicroMsg.ImageGalleryAdapter", "doRestransmitMsg fail, bigImgPath is null, msgLocalId = " + paramau.field_msgId + ", imgLocalId = " + locald.gGR);
      GMTrace.o(2416455974912L, 18004);
      return;
    }
    if (bg.nm(this.wKu))
    {
      w.i("MicroMsg.ImageGalleryAdapter", "directly send user is empty, select one");
      Intent localIntent = new Intent(this.wKs, MsgRetransmitUI.class);
      localIntent.putExtra("Retr_File_Name", (String)localObject);
      localIntent.putExtra("Retr_Msg_Id", paramau.field_msgId);
      localIntent.putExtra("Retr_Msg_Type", 0);
      localIntent.putExtra("Retr_Compress_Type", b(paramau, locald));
      this.wKs.startActivity(localIntent);
      GMTrace.o(2416455974912L, 18004);
      return;
    }
    w.i("MicroMsg.ImageGalleryAdapter", "directly send user %s", new Object[] { this.wKu });
    int i;
    if (paramau.field_isSend == 1) {
      if (locald.II())
      {
        i = 1;
        paramau = q.zE();
        localObject = com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c(locald), "", "");
        if (!bg.nm((String)localObject))
        {
          w.i("MicroMsg.ImageGalleryAdapter", "connector click[img]: to[%s] fileName[%s]", new Object[] { locald, localObject });
          paramau = new com.tencent.mm.ao.k(paramau, this.wKu, (String)localObject, i);
          at.wS().a(paramau, 0);
          bq.BG().c(bq.gpc, null);
        }
        if (!this.wKv) {
          break label568;
        }
        paramau = new Intent(this.wKs, En_5b8fbb1e.class);
        paramau.addFlags(67108864);
        paramau.putExtra("Chat_User", this.wKu);
        this.wKs.startActivity(paramau);
      }
    }
    for (;;)
    {
      g.ork.i(10424, new Object[] { Integer.valueOf(3), Integer.valueOf(4), this.wKu });
      GMTrace.o(2416455974912L, 18004);
      return;
      i = 0;
      break;
      if (!locald.II())
      {
        i = 0;
        break;
      }
      paramau = com.tencent.mm.ao.e.a(locald);
      if (!com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l(paramau.gGS, "", "")))
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label568:
      com.tencent.mm.ui.base.h.bm(this.wKs, this.wKs.getString(R.l.cUq));
    }
  }
  
  public final View c(int paramInt, View paramView)
  {
    GMTrace.i(2417127063552L, 18009);
    final au localau = Dd(paramInt);
    View localView;
    final j localj;
    if (paramView == null)
    {
      localView = View.inflate(this.wKs, R.i.czM, null);
      localj = new j(this, localView);
      localView.setTag(localj);
      paramView = bd(localau);
      localj.jP = paramInt;
      localj.wNx = paramView;
      j.M(localj.lFh, 0);
      switch (j.5.wKH[paramView.ordinal()])
      {
      default: 
        label112:
        j.M(localj.wNU, 8);
        j.M(localj.wNL, 8);
        j.M(localj.wNR, 8);
        j.M(localj.wNQ, 8);
        w.d("MicroMsg.ImageGalleryAdapter", "position:%d, type: %s", new Object[] { Integer.valueOf(paramInt), paramView });
        switch (2.wKH[paramView.ordinal()])
        {
        }
        break;
      }
    }
    for (;;)
    {
      this.wKC = false;
      GMTrace.o(2417127063552L, 18009);
      return localView;
      localj = (j)paramView.getTag();
      localView = paramView;
      break;
      j.M(localj.wNF, 8);
      j.M(localj.wNz, 8);
      break label112;
      localj.cfU();
      j.M(localj.wNF, 0);
      j.M(localj.wNz, 8);
      if (localj.wNz == null) {
        break label112;
      }
      j.M(localj.wNB, 8);
      break label112;
      localj.cfT();
      j.M(localj.wNF, 8);
      j.M(localj.wNz, 0);
      break label112;
      j.M(localj.lFh, 8);
      j.M(localj.wNF, 8);
      j.M(localj.wNz, 8);
      break label112;
      this.wKx.a(localj, localau, paramInt);
      continue;
      j.M(localj.wNU, 0);
      j.M(localj.wNL, 8);
      j.M(localj.wNQ, 8);
      j.M(localj.wNR, 8);
      j.M(localj.wNJ, 8);
      final String str = bh(localau);
      try
      {
        paramView = com.tencent.mm.platformtools.j.ng(str);
        localObject = paramView;
        if (paramView == null)
        {
          localObject = com.tencent.mm.platformtools.j.nf(com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true));
          j.M(localj.wNQ, 0);
          new ae().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16263564754944L, 121173);
              l.a(localau, new l.a()
              {
                public final void dR(int paramAnonymous2Int1, int paramAnonymous2Int2)
                {
                  GMTrace.i(16263296319488L, 121171);
                  if (paramAnonymous2Int1 == paramAnonymous2Int2)
                  {
                    w.d("MicroMsg.ImageGalleryAdapter", "appmsgImg download finish! msgid: %s", new Object[] { Long.valueOf(b.1.this.gmh.field_msgId) });
                    j.M(b.1.this.wKE.wNQ, 8);
                  }
                  try
                  {
                    Bitmap localBitmap1 = com.tencent.mm.platformtools.j.ng(b.1.this.ikI);
                    if (localBitmap1 != null)
                    {
                      b.1.this.wKE.wNU.qbc = false;
                      com.tencent.mm.sdk.platformtools.k.i(b.1.this.wKE.wNU, localBitmap1.getWidth(), localBitmap1.getHeight());
                      b.1.this.wKE.wNU.eo(localBitmap1.getWidth(), localBitmap1.getHeight());
                      b.1.this.wKE.wNU.setImageBitmap(localBitmap1);
                      b.1.this.wKE.wNU.invalidate();
                    }
                    GMTrace.o(16263296319488L, 121171);
                    return;
                  }
                  catch (OutOfMemoryError localOutOfMemoryError)
                  {
                    for (;;)
                    {
                      w.w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", new Object[] { b.1.this.ikI });
                      Runtime.getRuntime().gc();
                      Runtime.getRuntime().runFinalization();
                      Bitmap localBitmap2 = com.tencent.mm.platformtools.j.nf(b.1.this.ikI);
                    }
                  }
                }
              });
              GMTrace.o(16263564754944L, 121173);
            }
          });
        }
        if (localObject == null)
        {
          w.w("MicroMsg.ImageGalleryAdapter", "get image fail");
          localj.wNU.setVisibility(8);
          localj.cfS().wNR.setVisibility(0);
          localj.cfS().wNT.setImageResource(R.k.cMO);
          localj.cfS().wNS.setText(this.wKs.getString(R.l.dCW));
        }
      }
      catch (OutOfMemoryError paramView)
      {
        Object localObject;
        for (;;)
        {
          w.w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", new Object[] { str });
          Runtime.getRuntime().gc();
          Runtime.getRuntime().runFinalization();
          paramView = com.tencent.mm.platformtools.j.nf(str);
        }
        localj.wNU.qbc = false;
        com.tencent.mm.sdk.platformtools.k.i(localj.wNU, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        localj.wNU.eo(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        localj.wNU.setImageBitmap((Bitmap)localObject);
        localj.wNU.invalidate();
      }
      continue;
      this.wKy.a(localj, localau, paramInt);
      continue;
      this.wKz.a(localj, localau, paramInt);
    }
  }
  
  public final int caw()
  {
    GMTrace.i(2417798152192L, 18014);
    int i = this.wKt.wKJ;
    GMTrace.o(2417798152192L, 18014);
    return 100000 - i;
  }
  
  public final int cax()
  {
    GMTrace.i(2417932369920L, 18015);
    int i = this.wKt.wKJ;
    int j = this.wKt.gQB;
    GMTrace.o(2417932369920L, 18015);
    return 100000 - i + j - 1;
  }
  
  public final void cfe()
  {
    GMTrace.i(17913771720704L, 133468);
    this.wKt.mk(false);
    GMTrace.o(17913771720704L, 133468);
  }
  
  public final boolean cff()
  {
    GMTrace.i(2417663934464L, 18013);
    boolean bool = this.wKt.wKK;
    GMTrace.o(2417663934464L, 18013);
    return bool;
  }
  
  public final au cfg()
  {
    GMTrace.i(2418737676288L, 18021);
    au localau = Dd(this.wKs.cfB());
    GMTrace.o(2418737676288L, 18021);
    return localau;
  }
  
  public final j cfh()
  {
    GMTrace.i(2418871894016L, 18022);
    Object localObject2 = this.wKx.Db(this.wKs.cfB());
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = this.wKy.Db(this.wKs.cfB());
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = this.wKz.Db(this.wKs.cfB());
    }
    GMTrace.o(2418871894016L, 18022);
    return (j)localObject2;
  }
  
  public final void cfi()
  {
    GMTrace.i(16136326348800L, 120225);
    this.wKy.onResume();
    GMTrace.o(16136326348800L, 120225);
  }
  
  public final void detach()
  {
    GMTrace.i(2417395499008L, 18011);
    this.wKx.detach();
    this.wKy.detach();
    this.wKz.detach();
    super.detach();
    GMTrace.o(2417395499008L, 18011);
  }
  
  public final com.tencent.mm.ao.d f(au paramau, boolean paramBoolean)
  {
    GMTrace.i(2414711144448L, 17991);
    paramau = this.wKx.f(paramau, paramBoolean);
    GMTrace.o(2414711144448L, 17991);
    return paramau;
  }
  
  public final int getCount()
  {
    GMTrace.i(2414308491264L, 17988);
    a locala = this.wKt;
    int i = locala.gQB;
    int j = locala.wKJ;
    GMTrace.o(2414308491264L, 17988);
    return i - j + 100000 + 1;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(2419140329472L, 18024);
    super.notifyDataSetChanged();
    GMTrace.o(2419140329472L, 18024);
  }
  
  public final MultiTouchImageView os(int paramInt)
  {
    GMTrace.i(2418200805376L, 18017);
    Object localObject = super.Cd(paramInt);
    if (localObject == null)
    {
      w.e("MicroMsg.ImageGalleryAdapter", "position : %s getMultiTouchImageViewByPosition is null", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(2418200805376L, 18017);
      return null;
    }
    localObject = ((View)localObject).findViewById(R.h.image);
    if ((localObject == null) || (((View)localObject).getVisibility() == 8))
    {
      GMTrace.o(2418200805376L, 18017);
      return null;
    }
    localObject = (MultiTouchImageView)localObject;
    GMTrace.o(2418200805376L, 18017);
    return (MultiTouchImageView)localObject;
  }
  
  public static final class a
  {
    private String eDs;
    public int gQB;
    public ae handler;
    private int rqp;
    private List<au> wKI;
    public int wKJ;
    protected boolean wKK;
    protected int wKL;
    protected int wKM;
    protected int wKN;
    protected long wKO;
    private b wKP;
    public HashMap<Long, com.tencent.mm.ao.d> wKQ;
    public HashMap<Long, com.tencent.mm.ao.d> wKR;
    
    public a(final long paramLong, String paramString, final b paramb, Boolean paramBoolean)
    {
      GMTrace.i(2469471977472L, 18399);
      this.wKK = false;
      this.wKQ = new HashMap();
      this.wKR = new HashMap();
      this.handler = new ae();
      this.eDs = paramString;
      this.wKI = new LinkedList();
      this.wKP = paramb;
      at.AR();
      paramString = com.tencent.mm.y.c.yM().cM(paramLong);
      if (paramString.field_msgId == 0L)
      {
        Assert.assertTrue("MicroMsg.AutoList <init>, currentMsg does not exist, currentMsgId = " + paramLong + ", stack = " + bg.bQW(), false);
        GMTrace.o(2469471977472L, 18399);
        return;
      }
      this.wKI.add(paramString);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2430951489536L, 18112);
          b.a.this.fg(paramLong);
          if (paramb.booleanValue()) {
            b.a.this.handler.postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2432696320000L, 18125);
                b.a.this.cfj();
                if (b.a.1.this.wKU.wKA != null) {
                  b.a.1.this.wKU.wKA.Xq();
                }
                GMTrace.o(2432696320000L, 18125);
              }
            }, 0L);
          }
          GMTrace.o(2430951489536L, 18112);
        }
      });
      paramb.wKs.wMI = new ImageGalleryUI.a()
      {
        public final void i(Boolean paramAnonymousBoolean)
        {
          GMTrace.i(2425985433600L, 18075);
          w.i("MicroMsg.AutoList", "isPlaying : " + paramAnonymousBoolean);
          if (!paramAnonymousBoolean.booleanValue())
          {
            b.a.this.cfj();
            if (paramb.wKA != null) {
              paramb.wKA.Xq();
            }
          }
          GMTrace.o(2425985433600L, 18075);
        }
      };
      GMTrace.o(2469471977472L, 18399);
    }
    
    private void cK(List<au> paramList)
    {
      GMTrace.i(2469606195200L, 18400);
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      int i = 0;
      while (i < paramList.size())
      {
        if (b.aX((au)paramList.get(i)))
        {
          localArrayList1.add(Long.valueOf(((au)paramList.get(i)).field_msgSvrId));
          if (((au)paramList.get(i)).field_isSend == 1) {
            localArrayList2.add(Long.valueOf(((au)paramList.get(i)).field_msgId));
          }
        }
        i += 1;
      }
      this.wKQ.putAll(com.tencent.mm.ao.n.IZ().a((Long[])localArrayList1.toArray(new Long[0])));
      this.wKR.putAll(com.tencent.mm.ao.n.IZ().b((Long[])localArrayList2.toArray(new Long[0])));
      GMTrace.o(2469606195200L, 18400);
    }
    
    private void n(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(2470008848384L, 18403);
      w.i("MicroMsg.AutoList", "start loadMsgInfo, currentMsgId = " + paramLong + ", forward = " + paramBoolean);
      if (b.txk) {
        at.AR();
      }
      for (List localList = com.tencent.mm.y.c.yN().b(this.eDs, b.juT, paramLong, paramBoolean); (localList == null) || (localList.size() == 0); localList = com.tencent.mm.y.c.yM().c(this.eDs, paramLong, paramBoolean))
      {
        w.w("MicroMsg.AutoList", "loadMsgInfo fail, addedMsgList is null, forward = " + paramBoolean);
        GMTrace.o(2470008848384L, 18403);
        return;
        at.AR();
      }
      w.i("MicroMsg.AutoList", "loadMsgInfo done, new added list, size = " + localList.size() + ", forward = " + paramBoolean);
      paramLong = System.currentTimeMillis();
      cK(localList);
      w.i("MicroMsg.AutoList", "loadImgInfo spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - paramLong) });
      if (paramBoolean)
      {
        this.wKI.addAll(localList);
        GMTrace.o(2470008848384L, 18403);
        return;
      }
      this.wKI.addAll(0, localList);
      this.rqp -= localList.size();
      if (this.rqp < 0)
      {
        w.e("MicroMsg.AutoList", "loadMsgInfo fail, min should not be minus, min = " + this.rqp);
        GMTrace.o(2470008848384L, 18403);
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder("min from ");
      int i = this.rqp;
      w.i("MicroMsg.AutoList", localList.size() + i + " to " + this.rqp);
      GMTrace.o(2470008848384L, 18403);
    }
    
    public final int Dn(int paramInt)
    {
      GMTrace.i(2469740412928L, 18401);
      int i = this.wKJ;
      GMTrace.o(2469740412928L, 18401);
      return paramInt - 100000 + i;
    }
    
    public final au Do(int paramInt)
    {
      GMTrace.i(2469874630656L, 18402);
      paramInt = Dn(paramInt);
      int i = this.rqp + this.wKI.size() - 1;
      if ((paramInt < this.rqp) || (paramInt > i))
      {
        w.e("MicroMsg.AutoList", "get, invalid pos " + paramInt + ", min = " + this.rqp + ", max = " + i);
        GMTrace.o(2469874630656L, 18402);
        return null;
      }
      w.d("MicroMsg.AutoList", "get, pos = " + paramInt);
      if (paramInt == this.rqp)
      {
        localau = (au)this.wKI.get(0);
        if (this.wKK) {
          n(localau.field_msgId, false);
        }
        GMTrace.o(2469874630656L, 18402);
        return localau;
      }
      if ((paramInt == i) && (i < this.gQB - 1))
      {
        localau = (au)this.wKI.get(this.wKI.size() - 1);
        if (this.wKK) {
          n(localau.field_msgId, true);
        }
        GMTrace.o(2469874630656L, 18402);
        return localau;
      }
      au localau = (au)this.wKI.get(paramInt - this.rqp);
      GMTrace.o(2469874630656L, 18402);
      return localau;
    }
    
    public final void cfj()
    {
      GMTrace.i(16018751619072L, 119349);
      this.wKK = true;
      this.gQB = this.wKL;
      this.rqp = this.wKM;
      this.wKJ = this.wKN;
      w.i("MicroMsg.AutoList", "totalCount %s min %s start %s", new Object[] { Integer.valueOf(this.gQB), Integer.valueOf(this.rqp), Integer.valueOf(this.wKJ) });
      long l = System.currentTimeMillis();
      w.i("MicroMsg.AutoList", "min spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      l = System.currentTimeMillis();
      n(this.wKO, true);
      w.i("MicroMsg.AutoList", "loadMsgInfo spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      l = System.currentTimeMillis();
      n(this.wKO, false);
      w.i("MicroMsg.AutoList", "loadMsgInfo spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      this.wKP.notifyDataSetChanged();
      if (this.wKP.wKs.isFinishing())
      {
        GMTrace.o(16018751619072L, 119349);
        return;
      }
      b localb = this.wKP;
      View localView = (View)this.wKP.wgn.get(99999);
      MMViewPager localMMViewPager = this.wKP.wKs.lEk;
      localb.c(99999, localView);
      GMTrace.o(16018751619072L, 119349);
    }
    
    public final void fg(long paramLong)
    {
      GMTrace.i(16018617401344L, 119348);
      long l = System.currentTimeMillis();
      w.i("MicroMsg.AutoList", "isBizChat = " + b.txk);
      if (b.txk)
      {
        at.AR();
        this.wKL = com.tencent.mm.y.c.yN().al(this.eDs, b.juT);
        w.i("MicroMsg.AutoList", "<init>, totalCount = " + this.wKL);
        w.i("MicroMsg.AutoList", "totalCount spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        l = System.currentTimeMillis();
        if (!b.txk) {
          break label257;
        }
        at.AR();
      }
      for (this.wKM = com.tencent.mm.y.c.yN().q(this.eDs, b.juT, paramLong);; this.wKM = com.tencent.mm.y.c.yM().K(this.eDs, paramLong))
      {
        w.i("MicroMsg.AutoList", "min spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        if (System.currentTimeMillis() - l > 1000L)
        {
          at.AR();
          w.w("MicroMsg.AutoList", "explain : %s", new Object[] { com.tencent.mm.y.c.yM().L(this.eDs, paramLong) });
        }
        this.wKN = this.wKM;
        this.wKO = paramLong;
        GMTrace.o(16018617401344L, 119348);
        return;
        at.AR();
        this.wKL = com.tencent.mm.y.c.yM().Cs(this.eDs);
        break;
        label257:
        at.AR();
      }
    }
    
    public final void mk(boolean paramBoolean)
    {
      GMTrace.i(17913637502976L, 133467);
      this.wKK = false;
      GMTrace.o(17913637502976L, 133467);
    }
    
    public final String toString()
    {
      GMTrace.i(2470143066112L, 18404);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("AutoList, Size = " + this.wKI.size());
      ((StringBuilder)localObject).append("; Content = {");
      Iterator localIterator = this.wKI.iterator();
      while (localIterator.hasNext())
      {
        ((StringBuilder)localObject).append(((au)localIterator.next()).field_msgId);
        ((StringBuilder)localObject).append(",");
      }
      ((StringBuilder)localObject).append("}");
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(2470143066112L, 18404);
      return (String)localObject;
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(2464908574720L, 18365);
      wKX = new b("unkown", 0);
      wKY = new b("image", 1);
      wKZ = new b("video", 2);
      wLa = new b("sight", 3);
      wLb = new b("appimage", 4);
      wLc = new b[] { wKX, wKY, wKZ, wLa, wLb };
      GMTrace.o(2464908574720L, 18365);
    }
    
    private b()
    {
      GMTrace.i(2464774356992L, 18364);
      GMTrace.o(2464774356992L, 18364);
    }
  }
  
  public static abstract interface c
  {
    public abstract void Xq();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */