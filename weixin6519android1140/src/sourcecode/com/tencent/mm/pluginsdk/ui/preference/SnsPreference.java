package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.mj;
import com.tencent.mm.g.a.mj.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.g;
import com.tencent.mm.ui.widget.QDisFadeImageView;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.LinkedList;
import java.util.List;

public final class SnsPreference
  extends Preference
  implements g
{
  private List<anu> ePZ;
  private MMActivity ezR;
  private int kXa;
  private String mTitle;
  private an ppi;
  private QDisFadeImageView tDA;
  private ImageView tDB;
  private ImageView tDC;
  private ImageView tDD;
  private a tDE;
  private QDisFadeImageView tDy;
  private QDisFadeImageView tDz;
  
  public SnsPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1039382085632L, 7744);
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(1039382085632L, 7744);
  }
  
  public SnsPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1039516303360L, 7745);
    this.mTitle = "";
    this.tDy = null;
    this.tDz = null;
    this.tDA = null;
    this.tDB = null;
    this.tDC = null;
    this.tDD = null;
    this.kXa = 255;
    this.ePZ = new LinkedList();
    this.tDE = new a();
    this.ezR = ((MMActivity)paramContext);
    this.mTitle = paramContext.getString(R.l.dkP);
    setLayoutResource(R.i.cBA);
    GMTrace.o(1039516303360L, 7745);
  }
  
  private void bNa()
  {
    int j = 0;
    GMTrace.i(1039650521088L, 7746);
    if (this.tDy != null)
    {
      this.tDy.setImageResource(R.e.white);
      this.tDy.setVisibility(4);
    }
    if (this.tDz != null)
    {
      this.tDz.setImageResource(R.e.white);
      this.tDz.setVisibility(4);
    }
    if (this.tDA != null)
    {
      this.tDA.setImageResource(R.e.white);
      this.tDA.setVisibility(4);
    }
    ImageView localImageView;
    if ((this.tDy != null) && (this.ePZ.size() > 0))
    {
      this.tDy.setVisibility(0);
      if (com.tencent.mm.compatible.util.f.ty()) {
        break label240;
      }
      this.tDy.setImageResource(R.g.aYu);
      localImageView = this.tDB;
    }
    label240:
    label385:
    label454:
    label470:
    for (;;)
    {
      for (int i = 8;; i = 0)
      {
        localImageView.setVisibility(i);
        if ((this.tDz != null) && (this.ePZ.size() >= 2))
        {
          this.tDz.setVisibility(0);
          if (com.tencent.mm.compatible.util.f.ty()) {
            break;
          }
          this.tDz.setImageResource(R.g.aYu);
        }
        if ((this.tDA == null) || (this.ePZ.size() < 3)) {
          break label454;
        }
        this.tDA.setVisibility(0);
        if (com.tencent.mm.compatible.util.f.ty()) {
          break label385;
        }
        this.tDA.setImageResource(R.g.aYu);
        GMTrace.o(1039650521088L, 7746);
        return;
        n.poO.b((anu)this.ePZ.get(0), this.tDy, this.ezR.hashCode(), this.ppi);
        localImageView = this.tDB;
        if (((anu)this.ePZ.get(0)).jib != 6) {
          break label470;
        }
      }
      n.poO.b((anu)this.ePZ.get(1), this.tDz, this.ezR.hashCode(), this.ppi);
      localImageView = this.tDC;
      if (((anu)this.ePZ.get(1)).jib == 6) {}
      for (i = 0;; i = 8)
      {
        localImageView.setVisibility(i);
        break;
      }
      n.poO.b((anu)this.ePZ.get(2), this.tDA, this.ezR.hashCode(), this.ppi);
      localImageView = this.tDD;
      if (((anu)this.ePZ.get(2)).jib == 6) {}
      for (i = j;; i = 8)
      {
        localImageView.setVisibility(i);
        GMTrace.o(1039650521088L, 7746);
        return;
      }
    }
  }
  
  public final void Py(String paramString)
  {
    GMTrace.i(1040053174272L, 7749);
    if (paramString == null)
    {
      GMTrace.o(1040053174272L, 7749);
      return;
    }
    this.ePZ.clear();
    at.AR();
    Object localObject = c.yK().TE(paramString);
    if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).fTq > 0) && (com.tencent.mm.l.a.eE(((af)localObject).field_type))) {
      this.ppi = an.vBd;
    }
    for (;;)
    {
      localObject = new mj();
      ((mj)localObject).eRl.username = paramString;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
      if (((mj)localObject).eRm.eRn != null) {
        this.ePZ.add(((mj)localObject).eRm.eRn);
      }
      if (((mj)localObject).eRm.eRo != null) {
        this.ePZ.add(((mj)localObject).eRm.eRo);
      }
      if (((mj)localObject).eRm.eRp != null) {
        this.ePZ.add(((mj)localObject).eRm.eRp);
      }
      bNa();
      GMTrace.o(1040053174272L, 7749);
      return;
      if (paramString.equals(q.zE())) {
        this.ppi = an.vBd;
      } else {
        this.ppi = an.vBe;
      }
    }
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(1039918956544L, 7748);
    super.onBindView(paramView);
    this.tDy = ((QDisFadeImageView)paramView.findViewById(R.h.bGO));
    this.tDy.setAlpha(this.kXa);
    this.tDy.setImageDrawable(this.tDE);
    this.tDz = ((QDisFadeImageView)paramView.findViewById(R.h.bGP));
    this.tDz.setAlpha(this.kXa);
    this.tDz.setImageDrawable(this.tDE);
    this.tDA = ((QDisFadeImageView)paramView.findViewById(R.h.bGQ));
    this.tDA.setAlpha(this.kXa);
    this.tDA.setImageDrawable(this.tDE);
    TextView localTextView = (TextView)paramView.findViewById(R.h.bdK);
    if (!bg.nm(this.mTitle))
    {
      localTextView.setText(this.mTitle);
      ViewGroup.LayoutParams localLayoutParams = localTextView.getLayoutParams();
      localLayoutParams.width = com.tencent.mm.br.a.V(this.mContext, R.f.aQg);
      localTextView.setLayoutParams(localLayoutParams);
    }
    this.tDB = ((ImageView)paramView.findViewById(R.h.cfs));
    this.tDC = ((ImageView)paramView.findViewById(R.h.cft));
    this.tDD = ((ImageView)paramView.findViewById(R.h.cfu));
    this.tDB.setVisibility(8);
    this.tDC.setVisibility(8);
    this.tDD.setVisibility(8);
    bNa();
    if ((paramView == null) || (this.ePZ == null))
    {
      GMTrace.o(1039918956544L, 7748);
      return;
    }
    paramView.setContentDescription(this.mContext.getString(R.l.dOI, new Object[] { Integer.valueOf(this.ePZ.size()) }));
    GMTrace.o(1039918956544L, 7748);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(1039784738816L, 7747);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBE, localViewGroup);
    GMTrace.o(1039784738816L, 7747);
    return paramViewGroup;
  }
  
  static final class a
    extends ColorDrawable
  {
    public a()
    {
      super();
      GMTrace.i(1040724262912L, 7754);
      GMTrace.o(1040724262912L, 7754);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\SnsPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */