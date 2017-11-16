package com.tencent.mm.plugin.sight.draft.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.modelvideo.k;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.b;
import com.tencent.mm.v.a.g;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class b
  extends com.tencent.mm.ui.o<com.tencent.mm.modelvideo.j>
{
  private int jJp;
  private int jMw;
  a oUc;
  private b oUd;
  private c oUe;
  private Set<e> oUf;
  private d oUg;
  a oUh;
  private int oUi;
  int oUj;
  private int oUk;
  private int oUl;
  private c oUm;
  e oUn;
  
  public b(Context paramContext, a parama)
  {
    super(paramContext, null);
    GMTrace.i(9360612786176L, 69742);
    this.oUc = new a();
    this.oUd = new b();
    this.oUe = new c();
    this.oUf = new HashSet();
    this.oUg = d.oUp;
    this.oUi = R.l.ecY;
    this.oUj = 0;
    this.oUm = new c()
    {
      public final void q(String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(9363028705280L, 69760);
        Iterator localIterator = b.a(b.this).iterator();
        while (localIterator.hasNext())
        {
          b.e locale = (b.e)localIterator.next();
          if ((locale.oUv != null) && (bg.aq(paramAnonymousString, "").equals(locale.oUv.field_fileName))) {
            locale.oUt.D(paramAnonymousBitmap);
          }
        }
        GMTrace.o(9363028705280L, 69760);
      }
    };
    this.oUh = parama;
    int i = paramContext.getResources().getDimensionPixelSize(R.f.aSQ) * 2;
    this.oUk = (paramContext.getResources().getDisplayMetrics().widthPixels / 3);
    this.jMw = (this.oUk - i);
    this.jJp = (this.jMw * 3 / 4);
    this.oUl = (i + this.jJp);
    GMTrace.o(9360612786176L, 69742);
  }
  
  public final void QF()
  {
    GMTrace.i(9361283874816L, 69747);
    QG();
    super.notifyDataSetChanged();
    GMTrace.o(9361283874816L, 69747);
  }
  
  protected final void QG()
  {
    GMTrace.i(9361418092544L, 69748);
    setCursor(com.tencent.mm.modelvideo.o.Nl().fTZ.rawQuery("SELECT * FROM SightDraftInfo WHERE fileStatus = ?  ORDER BY localId DESC ", new String[] { "1" }));
    GMTrace.o(9361418092544L, 69748);
  }
  
  final void a(e parame)
  {
    GMTrace.i(9360881221632L, 69744);
    if (parame == null)
    {
      parame = this.oUf.iterator();
      while (parame.hasNext()) {
        ((e)parame.next()).oUu.setVisibility(8);
      }
      GMTrace.o(9360881221632L, 69744);
      return;
    }
    Iterator localIterator = this.oUf.iterator();
    if (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      View localView = locale.oUu;
      if (parame == locale) {}
      for (int i = 8;; i = 0)
      {
        localView.setVisibility(i);
        break;
      }
    }
    GMTrace.o(9360881221632L, 69744);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(9361149657088L, 69746);
    this.oUf.clear();
    super.a(paramString, paraml);
    GMTrace.o(9361149657088L, 69746);
  }
  
  public final boolean a(d paramd, boolean paramBoolean)
  {
    GMTrace.i(9361015439360L, 69745);
    if (paramd == this.oUg)
    {
      if ((paramBoolean) && (this.oUh != null)) {
        this.oUh.bgU();
      }
      GMTrace.o(9361015439360L, 69745);
      return false;
    }
    this.oUg = paramd;
    this.oUc.bgV();
    notifyDataSetChanged();
    if ((paramBoolean) && (this.oUh != null)) {
      this.oUh.bgU();
    }
    GMTrace.o(9361015439360L, 69745);
    return true;
  }
  
  public final int getCount()
  {
    GMTrace.i(9361552310272L, 69749);
    int i = super.getCount() / 3;
    GMTrace.o(9361552310272L, 69749);
    return i + 1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(9360747003904L, 69743);
    Object localObject1;
    int i;
    Object localObject2;
    Object localObject3;
    if (paramView == null)
    {
      localObject1 = new f();
      paramView = new LinearLayout(paramViewGroup.getContext());
      paramView.setOrientation(0);
      i = 0;
      while (i < 3)
      {
        localObject2 = LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.cGH, paramView, false);
        localObject3 = new e();
        ((e)localObject3).kJj = ((View)localObject2);
        ((e)localObject3).kJj.setTag(localObject3);
        ((e)localObject3).oUs = ((View)localObject2).findViewById(R.h.ceV);
        ((e)localObject3).oUt = ((com.tencent.mm.plugin.sight.decode.a.a)((View)localObject2).findViewById(R.h.ceZ));
        ((e)localObject3).lkb = ((ImageView)((View)localObject2).findViewById(R.h.cfa));
        ((e)localObject3).oUu = ((View)localObject2).findViewById(R.h.cdg);
        ((e)localObject3).iuc = ((TextView)((View)localObject2).findViewById(R.h.ceY));
        ((e)localObject3).iuc.setText(this.oUi);
        ((e)localObject3).oKs = ((ImageView)((View)localObject2).findViewById(R.h.ceS));
        ((f)localObject1).oUw.add(localObject3);
        localObject4 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject4).weight = 1.0F;
        ((LinearLayout.LayoutParams)localObject4).height = this.oUl;
        paramView.addView((View)localObject2);
        ((View)localObject2).setOnClickListener(this.oUc);
        ((e)localObject3).oKs.setTag(localObject3);
        ((e)localObject3).oKs.setOnClickListener(this.oUe);
        i += 1;
      }
      paramView.setTag(localObject1);
    }
    int j;
    for (paramViewGroup = (ViewGroup)localObject1;; paramViewGroup = (f)paramView.getTag())
    {
      i = 0;
      for (;;)
      {
        if (i >= paramViewGroup.oUw.size()) {
          break label667;
        }
        j = paramInt * 3 + i;
        localObject1 = (e)paramViewGroup.oUw.get(i);
        this.oUf.add(localObject1);
        ((e)localObject1).oUu.setVisibility(8);
        ((e)localObject1).iuc.setVisibility(8);
        ((e)localObject1).lkb.setBackgroundResource(R.g.bao);
        ((e)localObject1).oUt.ar(null, false);
        ((e)localObject1).oUt.hr(false);
        ((e)localObject1).oUt.bgo();
        ((ImageView)((e)localObject1).oUt).setBackgroundResource(0);
        if (j < asx()) {
          break;
        }
        ((e)localObject1).oUv = null;
        ((e)localObject1).kJj.setVisibility(4);
        com.tencent.mm.ui.tools.j.m(((e)localObject1).oUs, 1.0F);
        i += 1;
      }
    }
    this.oUj -= 1;
    Object localObject4 = (com.tencent.mm.modelvideo.j)getItem(j);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      ((e)localObject1).oUv = null;
      ((e)localObject1).oUt.bgk();
      if (d.oUq != this.oUg) {
        break label645;
      }
      ((e)localObject1).oKs.setVisibility(0);
      com.tencent.mm.ui.tools.j.m(((e)localObject1).oUs, 0.95F);
    }
    for (;;)
    {
      ((e)localObject1).kJj.setVisibility(0);
      break;
      ((e)localObject1).oUv = ((com.tencent.mm.modelvideo.j)localObject4);
      localObject2 = this.oUm;
      localObject3 = ((com.tencent.mm.modelvideo.j)localObject4).field_fileName;
      localObject4 = k.mb(((com.tencent.mm.modelvideo.j)localObject4).field_fileName);
      if (this.oUj <= 0) {}
      for (boolean bool = true;; bool = false)
      {
        localObject2 = ((c)localObject2).o((String)localObject3, (String)localObject4, bool);
        ((ImageView)((e)localObject1).oUt).setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((e)localObject1).oUt.D((Bitmap)localObject2);
        break;
      }
      label645:
      ((e)localObject1).oKs.setVisibility(8);
      com.tencent.mm.ui.tools.j.m(((e)localObject1).oUs, 1.0F);
    }
    label667:
    GMTrace.o(9360747003904L, 69743);
    return paramView;
  }
  
  private final class a
    implements View.OnClickListener
  {
    public a()
    {
      GMTrace.i(9366384148480L, 69785);
      GMTrace.o(9366384148480L, 69785);
    }
    
    public final boolean bgV()
    {
      GMTrace.i(9366652583936L, 69787);
      if (b.c(b.this) != null)
      {
        b.c(b.this).iuc.setVisibility(8);
        b.c(b.this).oUt.hr(false);
        b.c(b.this).oUt.ar(null, false);
        Bitmap localBitmap = b.e(b.this).o(b.c(b.this).oUv.field_fileName, k.mb(b.c(b.this).oUv.field_fileName), true);
        b.c(b.this).oUt.D(localBitmap);
        b.c(b.this).lkb.setBackgroundResource(R.g.bao);
        com.tencent.mm.ui.tools.j.m(b.c(b.this).oUs, 1.0F);
        b.a(b.this, null);
        GMTrace.o(9366652583936L, 69787);
        return true;
      }
      GMTrace.o(9366652583936L, 69787);
      return false;
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(9366518366208L, 69786);
      if (!(paramView.getTag() instanceof b.e))
      {
        GMTrace.o(9366518366208L, 69786);
        return;
      }
      paramView = (b.e)paramView.getTag();
      if (paramView.oUv == null)
      {
        w.i("MicroMsg.SightDraftContainerAdapter", "click draft, but info null, curType %s", new Object[] { b.b(b.this) });
        bgV();
        b.a(b.this, null);
        GMTrace.o(9366518366208L, 69786);
        return;
      }
      Object localObject1;
      if (b.c(b.this) != paramView)
      {
        bgV();
        localObject1 = k.ma(paramView.oUv.field_fileName);
        paramView.oUt.hr(true);
        paramView.oUt.ar((String)localObject1, false);
        paramView.lkb.setBackgroundResource(R.g.bap);
        localObject1 = paramView.oUs;
        if ((localObject1 != null) && (!d.eu(11))) {
          break label209;
        }
      }
      for (;;)
      {
        b.b(b.this, paramView);
        b.a(b.this, paramView);
        if (b.d(b.this) != null) {
          b.d(b.this).bgT();
        }
        GMTrace.o(9366518366208L, 69786);
        return;
        label209:
        Object localObject2 = (Animator)((View)localObject1).getTag(a.g.gdO);
        if (localObject2 != null) {
          ((Animator)localObject2).cancel();
        }
        localObject2 = (AnimatorSet)AnimatorInflater.loadAnimator(((View)localObject1).getContext(), a.b.gck);
        ((AnimatorSet)localObject2).setTarget(localObject1);
        ((AnimatorSet)localObject2).start();
        ((View)localObject1).setTag(a.g.gdO, localObject2);
      }
    }
  }
  
  private final class b
    implements View.OnLongClickListener
  {
    public b()
    {
      GMTrace.i(9368263196672L, 69799);
      GMTrace.o(9368263196672L, 69799);
    }
    
    public final boolean onLongClick(View paramView)
    {
      GMTrace.i(9368397414400L, 69800);
      if (!(paramView.getTag() instanceof b.e))
      {
        GMTrace.o(9368397414400L, 69800);
        return true;
      }
      paramView = (b.e)paramView.getTag();
      if (paramView.oUv == null)
      {
        GMTrace.o(9368397414400L, 69800);
        return true;
      }
      if (-1 == paramView.oUv.field_fileStatus)
      {
        GMTrace.o(9368397414400L, 69800);
        return true;
      }
      b.this.a(b.d.oUq, true);
      GMTrace.o(9368397414400L, 69800);
      return true;
    }
  }
  
  private final class c
    implements View.OnClickListener
  {
    public c()
    {
      GMTrace.i(9370142244864L, 69813);
      GMTrace.o(9370142244864L, 69813);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(9370276462592L, 69814);
      if (!(paramView.getTag() instanceof b.e))
      {
        GMTrace.o(9370276462592L, 69814);
        return;
      }
      b.f(b.this).bgV();
      paramView = (b.e)paramView.getTag();
      if (paramView.oUv == null)
      {
        w.e("MicroMsg.SightDraftContainerAdapter", "draftInfo is NULL");
        GMTrace.o(9370276462592L, 69814);
        return;
      }
      paramView.oUv.field_fileStatus = 6;
      com.tencent.mm.modelvideo.o.Nl().c(paramView.oUv, new String[] { "localId" });
      b.this.a(null, null);
      GMTrace.o(9370276462592L, 69814);
    }
  }
  
  public static enum d
  {
    static
    {
      GMTrace.i(9370008027136L, 69812);
      oUp = new d("NORMAL", 0);
      oUq = new d("EDIT", 1);
      oUr = new d[] { oUp, oUq };
      GMTrace.o(9370008027136L, 69812);
    }
    
    private d()
    {
      GMTrace.i(9369873809408L, 69811);
      GMTrace.o(9369873809408L, 69811);
    }
  }
  
  private static final class e
  {
    TextView iuc;
    View kJj;
    ImageView lkb;
    ImageView oKs;
    View oUs;
    com.tencent.mm.plugin.sight.decode.a.a oUt;
    View oUu;
    com.tencent.mm.modelvideo.j oUv;
    
    public e()
    {
      GMTrace.i(9363968229376L, 69767);
      GMTrace.o(9363968229376L, 69767);
    }
  }
  
  private static final class f
  {
    List<b.e> oUw;
    
    public f()
    {
      GMTrace.i(9369068503040L, 69805);
      this.oUw = new LinkedList();
      GMTrace.o(9369068503040L, 69805);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\draft\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */