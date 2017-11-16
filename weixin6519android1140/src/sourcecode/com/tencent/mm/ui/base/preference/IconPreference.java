package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class IconPreference
  extends Preference
{
  private Context context;
  private String desc;
  public Drawable drawable;
  private int height;
  public ImageView mRV;
  private TextView mrx;
  private String oGP;
  private int oGQ;
  private int oGR;
  private int wjE;
  private int wjF;
  private int wjG;
  private ImageView wjH;
  private ViewGroup wjI;
  private TextView wjJ;
  private int wjL;
  private String wjM;
  private int wjN;
  private int wjO;
  private int wjP;
  private Bitmap wjQ;
  public int wjR;
  private int wjS;
  private int wjT;
  private View wjU;
  private View wjV;
  RelativeLayout.LayoutParams wjW;
  private TextView wjX;
  private TextView wjY;
  private ImageView wjZ;
  private boolean wka;
  public boolean wkb;
  private int wkc;
  public boolean wkd;
  
  public IconPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(20996752932864L, 156438);
    GMTrace.o(20996752932864L, 156438);
  }
  
  public IconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3206461521920L, 23890);
    GMTrace.o(3206461521920L, 23890);
  }
  
  public IconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3206595739648L, 23891);
    this.oGP = "";
    this.oGQ = -1;
    this.oGR = 8;
    this.wjE = 8;
    this.wjL = 8;
    this.desc = "";
    this.wjM = "";
    this.wjN = -1;
    this.wjO = 8;
    this.wjP = -1;
    this.wjQ = null;
    this.wjR = -1;
    this.wjS = 8;
    this.wjF = 0;
    this.wjG = 8;
    this.wjT = 8;
    this.mRV = null;
    this.wjH = null;
    this.wjI = null;
    this.wjU = null;
    this.wjV = null;
    this.height = -1;
    this.wka = false;
    this.wkb = false;
    this.wkc = -1;
    this.wkd = false;
    this.context = paramContext;
    setLayoutResource(a.h.cBA);
    GMTrace.o(3206595739648L, 23891);
  }
  
  public final void Ck(int paramInt)
  {
    GMTrace.i(3207266828288L, 23896);
    this.oGR = paramInt;
    if (this.wjY != null) {
      this.wjY.setVisibility(paramInt);
    }
    GMTrace.o(3207266828288L, 23896);
  }
  
  public final void Cl(int paramInt)
  {
    GMTrace.i(3207401046016L, 23897);
    this.wjO = paramInt;
    if (this.wjX != null) {
      this.wjX.setVisibility(paramInt);
    }
    GMTrace.o(3207401046016L, 23897);
  }
  
  public final void Cm(int paramInt)
  {
    GMTrace.i(3207669481472L, 23899);
    this.wjE = paramInt;
    if (this.wjH != null) {
      this.wjH.setVisibility(paramInt);
    }
    GMTrace.o(3207669481472L, 23899);
  }
  
  public final void Cn(int paramInt)
  {
    GMTrace.i(3207937916928L, 23901);
    this.wjR = paramInt;
    this.wjQ = null;
    if (this.mRV != null) {
      this.mRV.setImageResource(paramInt);
    }
    GMTrace.o(3207937916928L, 23901);
  }
  
  public final void Co(int paramInt)
  {
    GMTrace.i(3208072134656L, 23902);
    this.wjS = paramInt;
    if (this.mRV != null) {
      this.mRV.setVisibility(this.wjS);
    }
    GMTrace.o(3208072134656L, 23902);
  }
  
  public final void Cp(int paramInt)
  {
    GMTrace.i(3208206352384L, 23903);
    this.wjF = paramInt;
    if (this.wjI != null) {
      this.wjI.setVisibility(this.wjF);
    }
    GMTrace.o(3208206352384L, 23903);
  }
  
  public final void Cq(int paramInt)
  {
    GMTrace.i(3208340570112L, 23904);
    this.wjG = paramInt;
    if (this.wjU != null) {
      this.wjU.setVisibility(this.wjG);
    }
    GMTrace.o(3208340570112L, 23904);
  }
  
  public final void Cr(int paramInt)
  {
    GMTrace.i(16266920198144L, 121198);
    this.wjT = paramInt;
    if (this.wjV != null) {
      this.wjV.setVisibility(paramInt);
    }
    GMTrace.o(16266920198144L, 121198);
  }
  
  public final void T(Bitmap paramBitmap)
  {
    GMTrace.i(3207803699200L, 23900);
    this.wjQ = paramBitmap;
    this.wjR = -1;
    if (this.mRV != null) {
      this.mRV.setImageBitmap(paramBitmap);
    }
    GMTrace.o(3207803699200L, 23900);
  }
  
  public final void VJ(String paramString)
  {
    GMTrace.i(20287546458112L, 151154);
    this.desc = paramString;
    if (this.mrx != null) {
      this.mrx.setText(paramString);
    }
    GMTrace.o(20287546458112L, 151154);
  }
  
  public final void X(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(3207132610560L, 23895);
    this.wjM = paramString;
    this.wjN = paramInt1;
    this.wjP = paramInt2;
    if (this.wjX != null)
    {
      this.wjX.setText(paramString);
      if (paramInt1 != -1) {
        this.wjX.setBackgroundDrawable(a.b(this.context, paramInt1));
      }
      if (paramInt2 != -1) {
        this.wjX.setTextColor(paramInt2);
      }
    }
    GMTrace.o(3207132610560L, 23895);
  }
  
  public final void cS(String paramString, int paramInt)
  {
    GMTrace.i(3206864175104L, 23893);
    this.oGP = paramString;
    this.oGQ = paramInt;
    GMTrace.o(3206864175104L, 23893);
  }
  
  public final void cT(String paramString, int paramInt)
  {
    GMTrace.i(3206998392832L, 23894);
    X(paramString, paramInt, this.wjP);
    GMTrace.o(3206998392832L, 23894);
  }
  
  public final void caX()
  {
    GMTrace.i(20287680675840L, 151155);
    this.wjL = 0;
    if (this.mrx != null) {
      this.mrx.setVisibility(0);
    }
    GMTrace.o(20287680675840L, 151155);
  }
  
  public final void es(int paramInt1, int paramInt2)
  {
    GMTrace.i(16266785980416L, 121197);
    this.wjE = paramInt1;
    this.wkc = paramInt2;
    GMTrace.o(16266785980416L, 121197);
  }
  
  public final void et(int paramInt1, int paramInt2)
  {
    GMTrace.i(20287814893568L, 151156);
    this.wjW = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    this.wjW.addRule(13);
    if (this.mRV == null)
    {
      GMTrace.o(20287814893568L, 151156);
      return;
    }
    this.mRV.setLayoutParams(this.wjW);
    GMTrace.o(20287814893568L, 151156);
  }
  
  public final void lO(boolean paramBoolean)
  {
    GMTrace.i(3207535263744L, 23898);
    this.wka = paramBoolean;
    if (this.wjX != null)
    {
      if (paramBoolean)
      {
        this.wjX.setCompoundDrawablesWithIntrinsicBounds(0, 0, a.f.gcP, 0);
        this.wjX.setCompoundDrawablePadding((int)this.context.getResources().getDimension(a.e.aQN));
        GMTrace.o(3207535263744L, 23898);
        return;
      }
      this.wjX.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
    GMTrace.o(3207535263744L, 23898);
  }
  
  public void onBindView(View paramView)
  {
    GMTrace.i(3208474787840L, 23905);
    super.onBindView(paramView);
    this.wjZ = ((ImageView)paramView.findViewById(a.g.bGN));
    Object localObject;
    if (this.wjZ != null)
    {
      if (this.drawable != null)
      {
        this.wjZ.setImageDrawable(this.drawable);
        this.wjZ.setVisibility(0);
      }
    }
    else
    {
      localObject = (LinearLayout)paramView.findViewById(a.g.bNt);
      ((LinearLayout)localObject).setMinimumHeight((int)(paramView.getResources().getDimensionPixelSize(a.e.aQM) * a.ec(this.context)));
      if (this.height != -1) {
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      }
      this.wjY = ((TextView)paramView.findViewById(a.g.cgQ));
      if (this.wjY != null)
      {
        if (!this.wkb) {
          break label730;
        }
        this.wjY.setCompoundDrawablesWithIntrinsicBounds(a.f.gcP, 0, 0, 0);
        this.wjY.setCompoundDrawablePadding((int)this.context.getResources().getDimension(a.e.aQN));
        label174:
        this.wjY.setVisibility(this.oGR);
        this.wjY.setText(this.oGP);
        if (this.oGQ != -1) {
          this.wjY.setBackgroundDrawable(a.b(this.context, this.oGQ));
        }
      }
      this.wjX = ((TextView)paramView.findViewById(a.g.gel));
      if (this.wjX != null)
      {
        this.wjX.setVisibility(this.wjO);
        this.wjX.setText(this.wjM);
        if (this.wjN != -1) {
          this.wjX.setBackgroundDrawable(a.b(this.context, this.wjN));
        }
        if (this.wjP != -1) {
          this.wjX.setTextColor(this.wjP);
        }
        if (!this.wka) {
          break label744;
        }
        this.wjX.setCompoundDrawablesWithIntrinsicBounds(0, 0, a.f.gcP, 0);
        this.wjX.setCompoundDrawablePadding((int)this.context.getResources().getDimension(a.e.aQN));
      }
      label351:
      this.wjH = ((ImageView)paramView.findViewById(a.g.gej));
      this.wjH.setVisibility(this.wjE);
      if (this.wkc != -1) {
        this.wjH.setImageResource(this.wkc);
      }
      this.mRV = ((ImageView)paramView.findViewById(a.g.gdo));
      this.wjI = ((ViewGroup)paramView.findViewById(a.g.gdT));
      this.wjV = paramView.findViewById(a.g.gdS);
      this.wjV.setVisibility(this.wjT);
      this.wjU = paramView.findViewById(a.g.bYQ);
      this.wjU.setVisibility(this.wjG);
      if (this.wjQ == null) {
        break label758;
      }
      this.mRV.setImageBitmap(this.wjQ);
      label485:
      this.mRV.setVisibility(this.wjS);
      this.wjI.setVisibility(this.wjF);
      if (this.wjW != null) {
        this.mRV.setLayoutParams(this.wjW);
      }
      this.wjJ = ((TextView)paramView.findViewById(16908310));
      this.mrx = ((TextView)paramView.findViewById(a.g.btg));
      if (this.mrx != null)
      {
        this.mrx.setVisibility(this.wjL);
        this.mrx.setText(this.desc);
        if (!this.wkd) {
          break label780;
        }
        this.mrx.setTextColor(this.context.getResources().getColor(a.d.gcm));
      }
      label609:
      if (this.wjJ != null)
      {
        if (!this.wkd) {
          break label803;
        }
        this.wjJ.setTextColor(this.context.getResources().getColor(a.d.gcm));
      }
      label643:
      if (this.wkd) {
        break label826;
      }
    }
    label730:
    label744:
    label758:
    label780:
    label803:
    label826:
    for (boolean bool = true;; bool = false)
    {
      paramView.setEnabled(bool);
      GMTrace.o(3208474787840L, 23905);
      return;
      if (this.Jx != 0)
      {
        localObject = this.wjZ;
        Drawable localDrawable = this.mContext.getResources().getDrawable(this.Jx);
        this.drawable = localDrawable;
        ((ImageView)localObject).setImageDrawable(localDrawable);
        this.wjZ.setVisibility(0);
        break;
      }
      this.wjZ.setVisibility(8);
      break;
      this.wjY.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label174;
      this.wjX.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label351;
      if (this.wjR == -1) {
        break label485;
      }
      this.mRV.setImageResource(this.wjR);
      break label485;
      this.mrx.setTextColor(this.context.getResources().getColor(a.d.aOa));
      break label609;
      this.wjJ.setTextColor(this.context.getResources().getColor(a.d.aOE));
      break label643;
    }
  }
  
  public View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3206729957376L, 23892);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.h.gfr, localViewGroup);
    GMTrace.o(3206729957376L, 23892);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\IconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */