package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.m;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.v;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.d;
import com.tencent.mm.y.d.a;
import java.util.HashMap;

public final class h
  extends a
  implements s.a, aj.a, d.a
{
  private d imE;
  private HashMap<String, i.a> wMh;
  private boolean wMi;
  
  public h(b paramb)
  {
    super(paramb);
    GMTrace.i(2431085707264L, 18113);
    this.wMi = false;
    this.wMi = false;
    this.wMh = new HashMap();
    o.Nh().a(this, Looper.getMainLooper());
    this.imE = new d();
    GMTrace.o(2431085707264L, 18113);
  }
  
  private void a(r paramr, j paramj)
  {
    GMTrace.i(2431622578176L, 18117);
    if (paramr == null)
    {
      GMTrace.o(2431622578176L, 18117);
      return;
    }
    com.tencent.mm.modelvideo.t.mu(paramr.getFileName());
    paramj.cfT().wND.setVisibility(0);
    paramj.cfT().wND.setProgress(com.tencent.mm.modelvideo.t.f(paramr));
    o.Nh().a(this, Looper.getMainLooper());
    GMTrace.o(2431622578176L, 18117);
  }
  
  private void a(au paramau, final j paramj)
  {
    GMTrace.i(2431756795904L, 18118);
    if (this.wMi)
    {
      GMTrace.o(2431756795904L, 18118);
      return;
    }
    paramj.cfT().wNE.setVisibility(8);
    o.Nh();
    String str = s.mk(paramau.field_imgPath);
    if (paramau.bTO())
    {
      Toast.makeText(this.wKr.wKs, R.l.egq, 0).show();
      GMTrace.o(2431756795904L, 18118);
      return;
    }
    if ((str == null) || (!e.aZ(str)))
    {
      Toast.makeText(this.wKr.wKs, R.l.egq, 0).show();
      GMTrace.o(2431756795904L, 18118);
      return;
    }
    this.wKr.wKs.vKB.vKW.getWindow().addFlags(128);
    Boolean localBoolean = (Boolean)paramj.wNy.get(str);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      ((View)paramj.cfT().wNA).setTag(str);
      paramj.cfT().wNC.setVisibility(8);
      paramj.cfT().wNA.stop();
      if (this.wKr.wKs.fi(paramau.field_msgId) != 3) {
        break label377;
      }
      paramj.cfT().wNA.setMute(true);
      paramj.cfT().wNA.setVideoPath(str);
      if (paramj.cfT().wNA.j(this.wKr.wKs.vKB.vKW, false)) {
        break label393;
      }
      paramj.cfT().wNC.setVisibility(0);
      paramj.cfT().wNC.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2465848098816L, 18372);
          paramj.cfT().wNA.j(h.this.wKr.wKs.vKB.vKW, true);
          GMTrace.o(2465848098816L, 18372);
        }
      });
      ((View)paramj.cfT().wNA).setVisibility(8);
      paramj.cfT().wNB.setVisibility(0);
    }
    for (;;)
    {
      w.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool requestFocus");
      this.imE.a(this);
      ((View)paramj.cfT().wNA).setVisibility(0);
      GMTrace.o(2431756795904L, 18118);
      return;
      label377:
      paramj.cfT().wNA.setMute(false);
      break;
      label393:
      ((View)paramj.cfT().wNA).setVisibility(0);
      paramj.cfT().wNB.setVisibility(8);
    }
  }
  
  private static void a(j paramj, boolean paramBoolean)
  {
    GMTrace.i(2431891013632L, 18119);
    if (paramj == null)
    {
      GMTrace.o(2431891013632L, 18119);
      return;
    }
    paramj.cfT().wND.setVisibility(8);
    if (paramBoolean)
    {
      paramj.cfT().wNB.setVisibility(8);
      ((View)paramj.cfT().wNA).setVisibility(0);
      GMTrace.o(2431891013632L, 18119);
      return;
    }
    paramj.cfT().wNB.setVisibility(0);
    ((View)paramj.cfT().wNA).setVisibility(8);
    GMTrace.o(2431891013632L, 18119);
  }
  
  private boolean a(i.a parama)
  {
    GMTrace.i(2432159449088L, 18121);
    if (parama == null)
    {
      GMTrace.o(2432159449088L, 18121);
      return false;
    }
    o.Nh().a(this);
    if (this.wKr.wKs.cfB() == parama.pos)
    {
      parama = Db(parama.pos);
      if (parama != null) {
        parama.cfT().wND.setVisibility(8);
      }
      GMTrace.o(2432159449088L, 18121);
      return true;
    }
    this.wKr.Dk(parama.pos);
    GMTrace.o(2432159449088L, 18121);
    return false;
  }
  
  public final void Ds(int paramInt)
  {
    GMTrace.i(2431488360448L, 18116);
    au localau = this.wKr.Dd(paramInt);
    j localj = Db(paramInt);
    if ((localau == null) || (localj == null))
    {
      GMTrace.o(2431488360448L, 18116);
      return;
    }
    r localr = com.tencent.mm.modelvideo.t.mw(localau.field_imgPath);
    if (localr != null)
    {
      if (localau.field_isSend == 0)
      {
        if ((localr.status == 113) || (localr.status == 111) || (localr.status == 112))
        {
          a(localr, localj);
          GMTrace.o(2431488360448L, 18116);
          return;
        }
        if (localr.status == 198)
        {
          a(localr, localj);
          GMTrace.o(2431488360448L, 18116);
          return;
        }
      }
      a(localau, localj);
    }
    GMTrace.o(2431488360448L, 18116);
  }
  
  public final void a(s.a.a parama)
  {
    GMTrace.i(2432427884544L, 18123);
    Object localObject = parama.euR;
    if ((com.tencent.mm.platformtools.t.nm((String)localObject)) || (this.wMh == null))
    {
      GMTrace.o(2432427884544L, 18123);
      return;
    }
    parama = (i.a)this.wMh.get(localObject);
    if (parama == null)
    {
      GMTrace.o(2432427884544L, 18123);
      return;
    }
    au localau = parama.eAH;
    if ((localau == null) || (localau.field_imgPath == null) || (!localau.field_imgPath.equals(localObject)))
    {
      GMTrace.o(2432427884544L, 18123);
      return;
    }
    localObject = com.tencent.mm.modelvideo.t.mw(localau.field_imgPath);
    if (localObject == null)
    {
      GMTrace.o(2432427884544L, 18123);
      return;
    }
    if ((localau.bTO()) || (((r)localObject).status == 198))
    {
      if (a(parama)) {
        Toast.makeText(this.wKr.wKs, R.l.egq, 0).show();
      }
      GMTrace.o(2432427884544L, 18123);
      return;
    }
    int i = com.tencent.mm.modelvideo.t.f((r)localObject);
    localObject = Db(parama.pos);
    if ((this.wKr.wKs.cfB() == parama.pos) && (localObject != null))
    {
      ((j)localObject).cfT().wND.setVisibility(0);
      ((j)localObject).cfT().wND.setProgress(i);
    }
    while (i < ((j)localObject).cfU().wND.xqu)
    {
      GMTrace.o(2432427884544L, 18123);
      return;
      if (localObject == null)
      {
        GMTrace.o(2432427884544L, 18123);
        return;
      }
    }
    if (a(parama)) {
      a(localau, (j)localObject);
    }
    GMTrace.o(2432427884544L, 18123);
  }
  
  public final boolean a(j paramj, au paramau, int paramInt)
  {
    GMTrace.i(2431219924992L, 18114);
    super.a(paramj, paramau, paramInt);
    o.Nh();
    Object localObject1 = BackwardSupportUtil.b.c(s.ml(paramau.field_imgPath), 1.0F);
    if (this.wMh != null) {
      this.wMh.put(paramau.field_imgPath, new i.a(paramau, paramInt));
    }
    a(paramj, false);
    ((View)paramj.cfT().wNA).setVisibility(8);
    paramj.cfT().wNB.setImageBitmap((Bitmap)localObject1);
    paramj.cfT().wNB.setVisibility(0);
    paramj.cfT().wNE.setVisibility(8);
    localObject1 = com.tencent.mm.modelvideo.t.mw(paramau.field_imgPath);
    paramj.wNE.setTag(localObject1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = null;
      if (localObject2 != null) {
        break label208;
      }
      paramj.lhN.setVisibility(8);
    }
    for (;;)
    {
      if ((paramj.cfT().wNA instanceof VideoSightView)) {
        m.a(paramj.lhN, (VideoSightView)paramj.cfT().wNA);
      }
      GMTrace.o(2431219924992L, 18114);
      return true;
      localObject2 = ((r)localObject1).hcE;
      break;
      label208:
      if (com.tencent.mm.platformtools.t.nm(((bhr)localObject2).gkI))
      {
        w.i("MicroMsg.ImageGallerySightHandler", " there is no attachurl, show more info btn");
        localObject1 = ((bhr)localObject2).gkL;
        localObject2 = ((bhr)localObject2).gkM;
        if ((!bg.nm((String)localObject1)) && (!bg.nm((String)localObject2)))
        {
          paramj.lhN.setText((CharSequence)localObject1);
          paramj.lhN.setVisibility(0);
          paramj.lhN.setTag(paramau);
        }
        else
        {
          paramj.lhN.setVisibility(8);
        }
      }
      else
      {
        paramj.lhN.setVisibility(0);
        paramj.lhN.setText(this.wKr.wKs.getString(R.l.edf, new Object[] { Integer.valueOf(((bhr)localObject2).ulk) }));
        Object localObject3 = this.wKr.wKs.getString(R.l.edf);
        localObject1 = localObject3;
        if (((bhr)localObject2).ulk / 60 > 0) {
          localObject1 = (String)localObject3 + this.wKr.wKs.getString(R.l.edh, new Object[] { Integer.valueOf(((bhr)localObject2).ulk / 60) });
        }
        localObject3 = localObject1;
        if (((bhr)localObject2).ulk % 60 > 0) {
          localObject3 = (String)localObject1 + this.wKr.wKs.getString(R.l.edi, new Object[] { Integer.valueOf(((bhr)localObject2).ulk % 60) });
        }
        localObject1 = (String)localObject3 + this.wKr.wKs.getString(R.l.edg);
        paramj.lhN.setText((CharSequence)localObject1);
        paramj.lhN.setTag(paramau);
      }
    }
  }
  
  public final void cfo()
  {
    GMTrace.i(2431354142720L, 18115);
    SparseArray localSparseArray = this.wKr.wgn;
    int i = 0;
    while (i < localSparseArray.size())
    {
      int j = localSparseArray.keyAt(i);
      if ((localSparseArray.get(j) != null) && (((View)localSparseArray.get(j)).getTag() != null))
      {
        j localj = (j)((View)localSparseArray.get(j)).getTag();
        if ((localj.wNz != null) && (localj.cfT().wNz.getVisibility() == 0))
        {
          localj.cfT().wNA.a(null);
          if ((((View)localj.cfT().wNA).getVisibility() == 0) && (localj != null))
          {
            a(localj, false);
            if (localj.cfT().wNA != null) {
              localj.cfT().wNA.stop();
            }
            w.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool abandonFocus");
            this.imE.bf(false);
            this.wKr.wKs.vKB.vKW.getWindow().clearFlags(128);
          }
        }
      }
      i += 1;
    }
    GMTrace.o(2431354142720L, 18115);
  }
  
  public final void detach()
  {
    GMTrace.i(2432293666816L, 18122);
    cfo();
    this.wKr.wKs.vKB.vKW.getWindow().clearFlags(128);
    this.wMi = true;
    super.detach();
    this.wMh.clear();
    this.wMh = null;
    o.Nh().a(this);
    w.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool abandonFocus");
    this.imE.bf(true);
    GMTrace.o(2432293666816L, 18122);
  }
  
  public final boolean pM()
  {
    GMTrace.i(2432025231360L, 18120);
    if (this.wKr == null)
    {
      GMTrace.o(2432025231360L, 18120);
      return false;
    }
    j localj = this.wKr.cfh();
    if (localj == null)
    {
      GMTrace.o(2432025231360L, 18120);
      return false;
    }
    if (localj.wNz == null)
    {
      GMTrace.o(2432025231360L, 18120);
      return false;
    }
    if (localj.cfT().wNz.getVisibility() != 0)
    {
      GMTrace.o(2432025231360L, 18120);
      return false;
    }
    a(localj, true);
    GMTrace.o(2432025231360L, 18120);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */