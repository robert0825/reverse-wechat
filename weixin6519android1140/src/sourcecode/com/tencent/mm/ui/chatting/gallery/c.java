package com.tencent.mm.ui.chatting.gallery;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c
  extends com.tencent.mm.ui.o<au>
  implements View.OnClickListener
{
  private static Map<String, Integer> scq;
  private static Map<String, Integer> wLf;
  private LayoutInflater CJ;
  public boolean gRT;
  String iGc;
  protected com.tencent.mm.ao.a.a.c jQF;
  Context mContext;
  private boolean tIv;
  boolean txk;
  long wHM;
  private final ImageGalleryGridUI wLd;
  boolean wLe;
  
  static
  {
    GMTrace.i(2482893750272L, 18499);
    HashMap localHashMap = new HashMap();
    scq = localHashMap;
    localHashMap.put("avi", Integer.valueOf(R.k.cJp));
    scq.put("m4v", Integer.valueOf(R.k.cJp));
    scq.put("vob", Integer.valueOf(R.k.cJp));
    scq.put("mpeg", Integer.valueOf(R.k.cJp));
    scq.put("mpe", Integer.valueOf(R.k.cJp));
    scq.put("asx", Integer.valueOf(R.k.cJp));
    scq.put("asf", Integer.valueOf(R.k.cJp));
    scq.put("f4v", Integer.valueOf(R.k.cJp));
    scq.put("flv", Integer.valueOf(R.k.cJp));
    scq.put("mkv", Integer.valueOf(R.k.cJp));
    scq.put("wmv", Integer.valueOf(R.k.cJp));
    scq.put("wm", Integer.valueOf(R.k.cJp));
    scq.put("3gp", Integer.valueOf(R.k.cJp));
    scq.put("mp4", Integer.valueOf(R.k.cJp));
    scq.put("rmvb", Integer.valueOf(R.k.cJp));
    scq.put("rm", Integer.valueOf(R.k.cJp));
    scq.put("ra", Integer.valueOf(R.k.cJp));
    scq.put("ram", Integer.valueOf(R.k.cJp));
    scq.put("mp3pro", Integer.valueOf(R.k.cJe));
    scq.put("vqf", Integer.valueOf(R.k.cJe));
    scq.put("cd", Integer.valueOf(R.k.cJe));
    scq.put("md", Integer.valueOf(R.k.cJe));
    scq.put("mod", Integer.valueOf(R.k.cJe));
    scq.put("vorbis", Integer.valueOf(R.k.cJe));
    scq.put("au", Integer.valueOf(R.k.cJe));
    scq.put("amr", Integer.valueOf(R.k.cJe));
    scq.put("silk", Integer.valueOf(R.k.cJe));
    scq.put("wma", Integer.valueOf(R.k.cJe));
    scq.put("mmf", Integer.valueOf(R.k.cJe));
    scq.put("mid", Integer.valueOf(R.k.cJe));
    scq.put("midi", Integer.valueOf(R.k.cJe));
    scq.put("mp3", Integer.valueOf(R.k.cJe));
    scq.put("aac", Integer.valueOf(R.k.cJe));
    scq.put("ape", Integer.valueOf(R.k.cJe));
    scq.put("aiff", Integer.valueOf(R.k.cJe));
    scq.put("aif", Integer.valueOf(R.k.cJe));
    scq.put("doc", Integer.valueOf(R.k.cJt));
    scq.put("docx", Integer.valueOf(R.k.cJt));
    scq.put("ppt", Integer.valueOf(R.k.cJi));
    scq.put("pptx", Integer.valueOf(R.k.cJi));
    scq.put("xls", Integer.valueOf(R.k.cJa));
    scq.put("xlsx", Integer.valueOf(R.k.cJa));
    scq.put("pdf", Integer.valueOf(R.k.cJg));
    scq.put("unknown", Integer.valueOf(R.k.cJm));
    localHashMap = new HashMap();
    wLf = localHashMap;
    localHashMap.put("doc", Integer.valueOf(R.e.aMK));
    wLf.put("docx", Integer.valueOf(R.e.aMK));
    wLf.put("ppt", Integer.valueOf(R.e.aMN));
    wLf.put("pptx", Integer.valueOf(R.e.aMN));
    wLf.put("xls", Integer.valueOf(R.e.aMQ));
    wLf.put("xlsx", Integer.valueOf(R.e.aMQ));
    wLf.put("pdf", Integer.valueOf(R.e.aMM));
    wLf.put("unknown", Integer.valueOf(R.e.aMO));
    wLf.put("mp3pro", Integer.valueOf(R.e.aML));
    wLf.put("vqf", Integer.valueOf(R.e.aML));
    wLf.put("cd", Integer.valueOf(R.e.aML));
    wLf.put("md", Integer.valueOf(R.e.aML));
    wLf.put("mod", Integer.valueOf(R.e.aML));
    wLf.put("vorbis", Integer.valueOf(R.e.aML));
    wLf.put("au", Integer.valueOf(R.e.aML));
    wLf.put("amr", Integer.valueOf(R.e.aML));
    wLf.put("silk", Integer.valueOf(R.e.aML));
    wLf.put("wma", Integer.valueOf(R.e.aML));
    wLf.put("mmf", Integer.valueOf(R.e.aML));
    wLf.put("mid", Integer.valueOf(R.e.aML));
    wLf.put("midi", Integer.valueOf(R.e.aML));
    wLf.put("mp3", Integer.valueOf(R.e.aML));
    wLf.put("aac", Integer.valueOf(R.e.aML));
    wLf.put("ape", Integer.valueOf(R.e.aML));
    wLf.put("aiff", Integer.valueOf(R.e.aML));
    wLf.put("aif", Integer.valueOf(R.e.aML));
    GMTrace.o(2482893750272L, 18499);
  }
  
  public c(Context paramContext, au paramau, String paramString)
  {
    super(paramContext, paramau);
    GMTrace.i(2481283137536L, 18487);
    this.jQF = null;
    this.wLe = false;
    this.gRT = false;
    this.wLd = ((ImageGalleryGridUI)paramContext);
    this.iGc = paramString;
    this.txk = com.tencent.mm.af.f.dL(this.iGc);
    if (this.txk) {
      this.wHM = paramau.field_bizChatId;
    }
    at.AR();
    this.tIv = com.tencent.mm.y.c.isSDCardAvailable();
    this.CJ = LayoutInflater.from(paramContext);
    paramau = new com.tencent.mm.ao.a.a.c.a();
    paramau.gKH = 1;
    paramau.gLb = true;
    paramau.gKJ = (com.tencent.mm.br.a.ef(paramContext) / 3);
    paramau.gKI = (com.tencent.mm.br.a.ef(paramContext) / 3);
    paramau.gKV = R.e.aOG;
    this.jQF = paramau.Jn();
    GMTrace.o(2481283137536L, 18487);
  }
  
  private static String bi(au paramau)
  {
    GMTrace.i(2482356879360L, 18495);
    Object localObject1;
    if ((paramau.bTG()) || (paramau.bTH()))
    {
      com.tencent.mm.modelvideo.o.Nh();
      localObject1 = s.ml(paramau.field_imgPath);
    }
    for (;;)
    {
      w.i("MicroMsg.ImageGalleryGridAdapter", "MsgInfoForMonetUri imgPath : %s", new Object[] { localObject1 });
      Object localObject2 = localObject1;
      if (paramau.bTK())
      {
        Object localObject3 = f.a.eS(paramau.field_content);
        localObject2 = null;
        paramau = (au)localObject2;
        if (localObject3 != null)
        {
          paramau = (au)localObject2;
          if (((f.a)localObject3).eAE != null)
          {
            paramau = (au)localObject2;
            if (((f.a)localObject3).eAE.length() > 0)
            {
              localObject3 = an.afP().Op(((f.a)localObject3).eAE);
              paramau = (au)localObject2;
              if (localObject3 != null) {
                paramau = ((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath;
              }
            }
          }
        }
        localObject2 = localObject1;
        if (paramau != null) {
          localObject2 = paramau;
        }
      }
      GMTrace.o(2482356879360L, 18495);
      return (String)localObject2;
      localObject2 = n.IZ().b(paramau.field_imgPath, false, false);
      localObject1 = localObject2;
      if (!t.nm((String)localObject2))
      {
        localObject1 = localObject2;
        if (!((String)localObject2).endsWith("hd"))
        {
          localObject1 = localObject2;
          if (FileOp.aZ((String)localObject2 + "hd")) {
            localObject1 = (String)localObject2 + "hd";
          }
        }
      }
    }
  }
  
  private static int f(f.a parama)
  {
    GMTrace.i(2482088443904L, 18493);
    if (parama == null)
    {
      w.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:" + R.k.cJl);
      i = R.k.cJm;
      GMTrace.o(2482088443904L, 18493);
      return i;
    }
    if ((parama.type == 5) || (parama.type == 7) || (parama.type == 15))
    {
      i = R.k.cJn;
      GMTrace.o(2482088443904L, 18493);
      return i;
    }
    if (parama.type == 3)
    {
      i = R.k.cJe;
      GMTrace.o(2482088443904L, 18493);
      return i;
    }
    if ((parama.type == 6) && (scq.containsKey(t.nl(parama.giw))))
    {
      w.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:" + scq.get(t.nl(parama.giw)));
      i = ((Integer)scq.get(t.nl(parama.giw))).intValue();
      GMTrace.o(2482088443904L, 18493);
      return i;
    }
    int i = R.k.cJm;
    GMTrace.o(2482088443904L, 18493);
    return i;
  }
  
  private static int g(f.a parama)
  {
    GMTrace.i(2482222661632L, 18494);
    if (parama == null)
    {
      w.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:" + R.e.aMO);
      i = R.e.aMO;
      GMTrace.o(2482222661632L, 18494);
      return i;
    }
    if ((parama.type == 5) || (parama.type == 7) || (parama.type == 15))
    {
      i = R.e.aMP;
      GMTrace.o(2482222661632L, 18494);
      return i;
    }
    if ((parama.type == 6) && (wLf.containsKey(t.nl(parama.giw))))
    {
      w.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:" + wLf.get(t.nl(parama.giw)));
      i = ((Integer)wLf.get(t.nl(parama.giw))).intValue();
      GMTrace.o(2482222661632L, 18494);
      return i;
    }
    int i = R.e.aMO;
    GMTrace.o(2482222661632L, 18494);
    return i;
  }
  
  public final void QF()
  {
    GMTrace.i(2481551572992L, 18489);
    if (this.txk)
    {
      at.AR();
      setCursor(com.tencent.mm.y.c.yN().ag(this.iGc, this.wHM));
      GMTrace.o(2481551572992L, 18489);
      return;
    }
    at.AR();
    setCursor(com.tencent.mm.y.c.yM().Ce(this.iGc));
    GMTrace.o(2481551572992L, 18489);
  }
  
  protected final void QG()
  {
    GMTrace.i(2481685790720L, 18490);
    if (this.txk)
    {
      at.AR();
      setCursor(com.tencent.mm.y.c.yN().ag(this.iGc, this.wHM));
      GMTrace.o(2481685790720L, 18490);
      return;
    }
    at.AR();
    setCursor(com.tencent.mm.y.c.yM().Ce(this.iGc));
    GMTrace.o(2481685790720L, 18490);
  }
  
  public final boolean areAllItemsEnabled()
  {
    GMTrace.i(2481417355264L, 18488);
    GMTrace.o(2481417355264L, 18488);
    return false;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(2481820008448L, 18491);
    long l = paramInt;
    GMTrace.o(2481820008448L, 18491);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2481954226176L, 18492);
    if (paramView == null)
    {
      paramView = this.CJ.inflate(R.i.czK, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.oOJ = ((ImageView)paramView.findViewById(R.h.bFz));
      paramViewGroup.wHU = paramView.findViewById(R.h.ckJ);
      paramViewGroup.wLj = ((TextView)paramView.findViewById(R.h.bzQ));
      paramViewGroup.wLj.setVisibility(8);
      paramViewGroup.wLi = ((ImageView)paramView.findViewById(R.h.bzJ));
      paramViewGroup.wHV = ((TextView)paramView.findViewById(R.h.ckH));
      paramViewGroup.wHU.setVisibility(8);
      paramViewGroup.wHX = paramView.findViewById(R.h.ceX);
      paramViewGroup.wHX.setVisibility(8);
      paramViewGroup.wLk = paramView.findViewById(R.h.bzU);
      paramViewGroup.wLk.setVisibility(8);
      paramViewGroup.wHW = ((ImageView)paramView.findViewById(R.h.bFC));
      paramViewGroup.lCA = ((CheckBox)paramView.findViewById(R.h.bMz));
      paramViewGroup.lCB = paramView.findViewById(R.h.bMA);
      paramView.setTag(paramViewGroup);
    }
    au localau;
    for (;;)
    {
      paramViewGroup.wHX.setVisibility(8);
      paramViewGroup.wHU.setVisibility(8);
      paramViewGroup.wLk.setVisibility(8);
      paramViewGroup.wLj.setVisibility(8);
      localau = (au)getItem(paramInt);
      if (localau != null) {
        break;
      }
      GMTrace.o(2481954226176L, 18492);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
    Object localObject2;
    Object localObject1;
    int i;
    if (this.tIv)
    {
      if (!(this.wLd instanceof ImageGalleryGridUI)) {
        throw new IllegalArgumentException("the context should be ImageGalleryGridUI");
      }
      localObject2 = localau.field_content;
      localObject1 = null;
      if (localObject2 != null) {
        localObject1 = f.a.C((String)localObject2, localau.field_reserved);
      }
      if (this.wLd.wLl == paramInt)
      {
        paramViewGroup.wHW.setVisibility(0);
        if ((b.ba(localau)) && (localObject1 != null) && (((f.a)localObject1).type != 3))
        {
          paramViewGroup.wLi.setImageDrawable(this.wLd.getResources().getDrawable(f((f.a)localObject1)));
          paramViewGroup.oOJ.setImageResource(g((f.a)localObject1));
          paramViewGroup.oOJ.setPadding(0, 0, 0, 0);
          paramInt = paramViewGroup.oOJ.getMeasuredWidth();
          i = paramViewGroup.oOJ.getMeasuredHeight();
          if ((paramInt > 0) && (i > 0)) {
            break label775;
          }
          label443:
          if (!b.aY(localau)) {
            break label809;
          }
          if (paramViewGroup != null)
          {
            paramViewGroup.wHU.setVisibility(0);
            localObject1 = i.br(localau);
            if (localObject1 != null) {
              paramViewGroup.wHV.setText(t.hB(((r)localObject1).hcv));
            }
          }
          label490:
          paramViewGroup.lCA.setChecked(g.a.wMg.bp(localau));
          paramViewGroup.lCA.setTag(localau);
          paramViewGroup.lCB.setTag(paramViewGroup);
          paramViewGroup.lCB.setOnClickListener(this);
          if (!g.a.wMg.wMe) {
            break label980;
          }
          paramViewGroup.lCA.setVisibility(0);
          paramViewGroup.lCB.setVisibility(0);
          paramViewGroup.wHW.setVisibility(0);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(2481954226176L, 18492);
      return paramView;
      if ((localObject1 != null) && (((f.a)localObject1).type == 3)) {
        paramViewGroup.wLi.setImageDrawable(this.wLd.getResources().getDrawable(f((f.a)localObject1)));
      }
      n.Jd().a(bi(localau), paramViewGroup.oOJ, this.jQF, new com.tencent.mm.ao.a.c.i()
      {
        public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(2437528158208L, 18161);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2440883601408L, 18186);
              GMTrace.o(2440883601408L, 18186);
            }
          });
          GMTrace.o(2437528158208L, 18161);
        }
      });
      break;
      paramViewGroup.wHW.setVisibility(0);
      paramViewGroup.wHW.setBackgroundResource(R.g.aXo);
      if ((b.ba(localau)) && (localObject1 != null) && (((f.a)localObject1).type != 3))
      {
        paramViewGroup.wLi.setImageDrawable(this.wLd.getResources().getDrawable(f((f.a)localObject1)));
        paramViewGroup.oOJ.setImageResource(g((f.a)localObject1));
        break;
      }
      if ((localObject1 != null) && (((f.a)localObject1).type == 3)) {
        paramViewGroup.wLi.setImageDrawable(this.wLd.getResources().getDrawable(f((f.a)localObject1)));
      }
      n.Jd().a(bi(localau), paramViewGroup.oOJ, this.jQF);
      break;
      label775:
      localObject2 = paramViewGroup.wHW.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).width = paramInt;
      ((ViewGroup.LayoutParams)localObject2).height = i;
      paramViewGroup.wHW.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      break label443;
      label809:
      if (b.aZ(localau))
      {
        paramViewGroup.wHX.setVisibility(0);
        break label490;
      }
      if ((!b.ba(localau)) || (paramViewGroup == null)) {
        break label490;
      }
      paramViewGroup.wLk.setVisibility(0);
      paramViewGroup.wLj.setVisibility(0);
      if (localObject1 == null) {
        break label490;
      }
      w.i("MicroMsg.ImageGalleryGridAdapter", "initFileName--->content:%s", new Object[] { t.nl(((f.a)localObject1).title) });
      if (((f.a)localObject1).type != 24)
      {
        paramViewGroup.wLj.setText(h.b(this.mContext, t.nl(((f.a)localObject1).title), paramViewGroup.wLj.getTextSize()));
        break label490;
      }
      paramViewGroup.wLj.setText(h.b(paramViewGroup.wLj.getContext(), paramViewGroup.wLj.getContext().getString(R.l.dvi), paramViewGroup.wLj.getTextSize()));
      break label490;
      paramViewGroup.oOJ.setImageResource(R.g.aYv);
      break label490;
      label980:
      paramViewGroup.lCA.setVisibility(8);
      paramViewGroup.lCB.setVisibility(8);
      paramViewGroup.wHW.setVisibility(8);
    }
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(2482491097088L, 18496);
    super.notifyDataSetChanged();
    this.wLe = false;
    GMTrace.o(2482491097088L, 18496);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(2482625314816L, 18497);
    paramView = (a)paramView.getTag();
    if (paramView.lCA == null)
    {
      GMTrace.o(2482625314816L, 18497);
      return;
    }
    au localau = (au)paramView.lCA.getTag();
    if (localau == null)
    {
      GMTrace.o(2482625314816L, 18497);
      return;
    }
    g localg = g.a.wMg;
    if (localg.bp(localau))
    {
      localg.bo(localau);
      if (!g.a.wMg.bp(localau)) {
        break label163;
      }
      paramView.lCA.setChecked(true);
      paramView.wHW.setBackgroundResource(R.e.aNW);
    }
    for (;;)
    {
      if ((!this.gRT) && (g.a.wMg.wKD.size() > 1))
      {
        com.tencent.mm.plugin.report.service.g.ork.a(219L, 20L, 1L, true);
        this.gRT = true;
      }
      GMTrace.o(2482625314816L, 18497);
      return;
      localg.bn(localau);
      break;
      label163:
      paramView.lCA.setChecked(false);
      paramView.wHW.setBackgroundResource(R.g.aXo);
    }
  }
  
  protected static final class a
  {
    public CheckBox lCA;
    public View lCB;
    public ImageView oOJ;
    public View wHU;
    public TextView wHV;
    public ImageView wHW;
    public View wHX;
    public ImageView wLi;
    public TextView wLj;
    public View wLk;
    
    protected a()
    {
      GMTrace.i(2466653405184L, 18378);
      GMTrace.o(2466653405184L, 18378);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */