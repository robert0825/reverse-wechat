package com.tencent.mm.ui.base;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import com.tencent.mm.v.a.a;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.j;
import com.tencent.mm.v.a.l;
import java.util.Iterator;
import java.util.List;

public class i
  extends Dialog
  implements DialogInterface
{
  private CheckBox JS;
  private View iIG;
  private View jQ;
  private EditText jZ;
  private TextView kHZ;
  private Button kVx;
  private ImageView lYq;
  private Context mContext;
  private boolean oND;
  public Button rot;
  private LinearLayout vKk;
  private TextView vKl;
  private TextView vKm;
  private LinearLayout vKn;
  private LinearLayout vKo;
  private ViewGroup waA;
  private View waB;
  private boolean waC;
  private boolean waD;
  private Animation waE;
  private Animation waF;
  private Animation waG;
  private Animation waH;
  private i.a.c waI;
  private int[] waJ;
  private TextView wav;
  private TextView waw;
  private View wax;
  private ViewStub way;
  private ViewGroup waz;
  
  public i(Context paramContext)
  {
    super(paramContext, a.l.eme);
    GMTrace.i(3269678071808L, 24361);
    this.waC = false;
    this.waD = false;
    this.waJ = new int[] { a.g.geq, a.g.ger, a.g.ges, a.g.get, a.g.geu, a.g.gev, a.g.gew, a.g.gex, a.g.gey };
    this.mContext = paramContext;
    this.vKk = ((LinearLayout)v.fb(this.mContext).inflate(a.h.geZ, null));
    this.rot = ((Button)this.vKk.findViewById(a.g.bNq));
    this.kVx = ((Button)this.vKk.findViewById(a.g.bNg));
    this.kHZ = ((TextView)this.vKk.findViewById(a.g.gdy));
    this.vKl = ((TextView)this.vKk.findViewById(a.g.bNk));
    this.vKm = ((TextView)this.vKk.findViewById(a.g.gdx));
    this.wav = ((TextView)this.vKk.findViewById(a.g.bNo));
    this.waw = ((TextView)this.vKk.findViewById(a.g.bpW));
    this.jZ = ((EditText)this.vKk.findViewById(a.g.bqa));
    this.JS = ((CheckBox)this.vKk.findViewById(a.g.gdb));
    this.lYq = ((ImageView)this.vKk.findViewById(a.g.bNn));
    this.iIG = this.vKk.findViewById(a.g.gdz);
    this.way = ((ViewStub)this.vKk.findViewById(a.g.geA));
    this.vKn = ((LinearLayout)this.vKk.findViewById(a.g.bNl));
    this.waz = ((ViewGroup)this.vKk.findViewById(a.g.gdu));
    this.waB = this.vKk.findViewById(a.g.gdv);
    this.vKo = ((LinearLayout)this.vKk.findViewById(a.g.gdw));
    this.waA = ((ViewGroup)this.vKk.findViewById(a.g.gez));
    setCanceledOnTouchOutside(true);
    this.waE = AnimationUtils.loadAnimation(ab.getContext(), a.a.aLh);
    this.waF = AnimationUtils.loadAnimation(ab.getContext(), a.a.aLh);
    this.waG = AnimationUtils.loadAnimation(ab.getContext(), a.a.aLi);
    this.waH = AnimationUtils.loadAnimation(ab.getContext(), a.a.aLi);
    GMTrace.o(3269678071808L, 24361);
  }
  
  private void AS(int paramInt)
  {
    GMTrace.i(17802371006464L, 132638);
    if (this.vKl != null) {
      this.vKl.setTextColor(this.vKl.getContext().getResources().getColor(paramInt));
    }
    GMTrace.o(17802371006464L, 132638);
  }
  
  private void BK(int paramInt)
  {
    GMTrace.i(3270751813632L, 24369);
    if (this.vKn != null) {
      this.vKn.setVisibility(paramInt);
    }
    if (this.vKo != null) {
      this.vKo.setVisibility(paramInt);
    }
    if ((this.waw != null) && (this.waC)) {
      this.waw.setVisibility(paramInt);
    }
    if (this.jZ != null)
    {
      if (!this.waD)
      {
        this.jZ.setVisibility(8);
        GMTrace.o(3270751813632L, 24369);
        return;
      }
      this.jZ.setVisibility(paramInt);
    }
    GMTrace.o(3270751813632L, 24369);
  }
  
  private void cz(List<String> paramList)
  {
    GMTrace.i(3270886031360L, 24370);
    this.way.setLayoutResource(a.h.geQ);
    int i;
    String str;
    Object localObject;
    try
    {
      LinearLayout localLinearLayout = (LinearLayout)this.way.inflate();
      if (paramList == null) {
        break label137;
      }
      paramList = paramList.iterator();
      i = 0;
      if (!paramList.hasNext()) {
        break label137;
      }
      str = (String)paramList.next();
      if (i > 8)
      {
        GMTrace.o(3270886031360L, 24370);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.way.setVisibility(0);
        localObject = null;
      }
    }
    if (localObject != null)
    {
      ImageView localImageView = (ImageView)((LinearLayout)localObject).findViewById(this.waJ[i]);
      if (str != null)
      {
        localImageView.setVisibility(0);
        com.tencent.mm.ui.f.a.a.a(localImageView, str);
        i += 1;
      }
    }
    for (;;)
    {
      break;
      label137:
      GMTrace.o(3270886031360L, 24370);
      return;
    }
  }
  
  private void lw(boolean paramBoolean)
  {
    GMTrace.i(3270349160448L, 24366);
    if (paramBoolean)
    {
      int i = com.tencent.mm.br.a.fromDPToPix(this.mContext, 8);
      this.vKn.setVisibility(0);
      this.vKn.setPadding(i, i, i, i);
      this.vKn.setBackgroundResource(a.f.gcF);
    }
    GMTrace.o(3270349160448L, 24366);
  }
  
  public final void BL(int paramInt)
  {
    GMTrace.i(3271288684544L, 24373);
    this.rot.setTextColor(paramInt);
    GMTrace.o(3271288684544L, 24373);
  }
  
  public final void BM(int paramInt)
  {
    GMTrace.i(3271422902272L, 24374);
    this.kVx.setTextColor(paramInt);
    GMTrace.o(3271422902272L, 24374);
  }
  
  public final void H(View paramView, int paramInt)
  {
    GMTrace.i(3271020249088L, 24371);
    this.jQ = paramView;
    if (this.jQ != null)
    {
      this.vKn.setVisibility(0);
      this.vKo.setVisibility(0);
      this.vKo.removeAllViews();
      this.vKo.setGravity(1);
      this.vKo.addView(this.jQ, new LinearLayout.LayoutParams(paramInt, paramInt));
    }
    GMTrace.o(3271020249088L, 24371);
  }
  
  public final void a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3271557120000L, 24375);
    a(this.mContext.getString(paramInt), true, paramOnClickListener);
    GMTrace.o(3271557120000L, 24375);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(3272228208640L, 24380);
    if ((paramc.title != null) && (paramc.title.length() > 0)) {
      setTitle(paramc.title);
    }
    int i;
    if (paramc.trL != 0)
    {
      i = paramc.trL;
      this.kHZ.setTextColor(ColorStateList.valueOf(i));
    }
    if (paramc.vYH != 0)
    {
      i = paramc.vYH;
      this.kHZ.setMaxLines(i);
    }
    if (paramc.vYI != 0)
    {
      i = paramc.vYI;
      this.vKl.setMaxLines(i);
    }
    if (paramc.rLg != null) {
      H(paramc.rLg, -1);
    }
    if (paramc.vYG != null)
    {
      this.wax = paramc.vYG;
      if (this.wax != null)
      {
        this.vKn.setVisibility(8);
        this.waw.setVisibility(8);
        this.jZ.setVisibility(8);
        this.waA.removeAllViews();
        this.waA.addView(this.wax, new LinearLayout.LayoutParams(-1, -1));
        this.waA.setVisibility(8);
      }
    }
    if (paramc.vYt != null)
    {
      localObject1 = paramc.vYt;
      if (this.jQ == null)
      {
        this.vKn.setVisibility(0);
        this.lYq.setVisibility(0);
        this.lYq.setBackgroundDrawable((Drawable)localObject1);
      }
    }
    if ((paramc.vYw != null) && (paramc.vYw.length() > 0)) {
      setMessage(paramc.vYw);
    }
    lw(paramc.vYC);
    if (paramc.eIy != null)
    {
      localObject1 = paramc.eIy;
      i = com.tencent.mm.br.a.fromDPToPix(this.mContext, 120);
      this.vKn.setVisibility(0);
      this.lYq.setVisibility(0);
      if ((this.lYq instanceof com.tencent.mm.ui.f.a)) {
        ((com.tencent.mm.ui.f.a)this.lYq).R((String)localObject1, i, i);
      }
      i = paramc.vYL;
      this.vKn.setVisibility(i);
      this.lYq.setVisibility(i);
    }
    final Object localObject2;
    if ((!paramc.vYN) && (!paramc.vYO))
    {
      if ((paramc.vYw != null) && (paramc.vYw.length() > 0)) {
        setMessage(paramc.vYw);
      }
      if ((paramc.vYx == null) || (paramc.vYx.length() <= 0)) {
        break label1893;
      }
      localObject1 = paramc.vYx;
      this.vKn.setVisibility(0);
      this.vKm.setVisibility(0);
      this.vKm.setMaxLines(2);
      this.vKm.setText((CharSequence)localObject1);
      if ((paramc.vYy != null) && (paramc.vYy.length() > 0))
      {
        localObject2 = paramc.vYy;
        if (localObject2 != null)
        {
          this.vKn.setVisibility(0);
          this.wav.setVisibility(0);
          localObject1 = localObject2;
          if (this.waI != null)
          {
            localObject1 = this.waI;
            this.wav.getContext();
            localObject1 = ((i.a.c)localObject1).a(((CharSequence)localObject2).toString(), this.wav.getTextSize());
          }
          this.wav.setText((CharSequence)localObject1);
        }
      }
      if (paramc.vYu != null)
      {
        localObject1 = paramc.vYu;
        if (this.jQ == null)
        {
          this.vKn.setVisibility(0);
          this.lYq.setVisibility(0);
          this.lYq.setImageBitmap((Bitmap)localObject1);
        }
      }
    }
    Object localObject3;
    final Object localObject4;
    Object localObject5;
    if (paramc.vYN)
    {
      localObject1 = paramc.vYu;
      localObject3 = paramc.vYx;
      localObject2 = paramc.vYy;
      localObject4 = v.fb(this.mContext).inflate(a.h.geM, null);
      if (localObject1 != null)
      {
        localObject5 = (ImageView)((View)localObject4).findViewById(a.g.bNn);
        ((ImageView)localObject5).setVisibility(0);
        ((ImageView)localObject5).setImageBitmap((Bitmap)localObject1);
      }
      if (localObject3 != null)
      {
        localObject5 = (TextView)((View)localObject4).findViewById(a.g.gdx);
        ((TextView)localObject5).setVisibility(0);
        localObject1 = localObject3;
        if (this.waI != null) {
          localObject1 = this.waI.a(((CharSequence)localObject3).toString(), ((TextView)localObject5).getTextSize());
        }
        ((TextView)localObject5).setText((CharSequence)localObject1);
      }
      if (localObject2 != null)
      {
        localObject3 = (TextView)((View)localObject4).findViewById(a.g.bNo);
        ((TextView)localObject3).setVisibility(0);
        if (this.waI == null) {
          break label2331;
        }
      }
    }
    label1893:
    label2122:
    label2149:
    label2251:
    label2291:
    label2317:
    label2324:
    label2331:
    for (final Object localObject1 = this.waI.a(((CharSequence)localObject2).toString(), ((TextView)localObject3).getTextSize());; localObject1 = localException)
    {
      ((TextView)localObject3).setText((CharSequence)localObject1);
      H((View)localObject4, -1);
      for (;;)
      {
        boolean bool;
        if ((paramc.vYl != null) || (paramc.vYn != null))
        {
          localObject5 = paramc.vYl;
          localObject3 = paramc.vYn;
          bool = paramc.vYo;
          localObject4 = paramc.vYq;
          this.way.setLayoutResource(a.h.geP);
          localObject1 = null;
        }
        try
        {
          localObject2 = (LinearLayout)this.way.inflate();
          localObject1 = localObject2;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            int i1;
            int j;
            float f;
            int k;
            int m;
            this.way.setVisibility(0);
            continue;
            if (this.vKo != null)
            {
              this.vKo.setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymousView)
                {
                  GMTrace.i(3368193884160L, 25095);
                  if (localObject1 != null) {
                    localObject1.azi();
                  }
                  GMTrace.o(3368193884160L, 25095);
                }
              });
              continue;
              if ((f >= 0.5D) && (f < 1.0F))
              {
                j = (int)(i * f);
                k = i;
                m = j;
              }
              else
              {
                int n;
                if ((f >= 1.0F) && (f < 2.0F))
                {
                  n = (int)(i / f);
                  k = n;
                  m = i;
                  j = i;
                  i = n;
                }
                else if (f >= 2.0F)
                {
                  n = (int)(j * f);
                  k = j;
                  m = j;
                  j = i;
                  i = m;
                  m = n;
                  continue;
                  ((ImageView)localObject1).setVisibility(0);
                  if (i1 == 1)
                  {
                    ((ImageView)localObject1).setImageResource(a.j.gfY);
                  }
                  else if (i1 == 2)
                  {
                    ((ImageView)localObject1).setImageResource(a.j.cJp);
                    continue;
                    this.jZ.setVisibility(8);
                  }
                }
                else
                {
                  j = 0;
                  i = 0;
                  k = 0;
                  m = 0;
                  continue;
                  localObject1 = localException;
                  continue;
                  localObject1 = localException;
                }
              }
            }
          }
        }
        if ((localObject1 != null) && (localObject5 != null))
        {
          localObject2 = (ImageView)((LinearLayout)localObject1).findViewById(a.g.gep);
          ((ImageView)localObject2).setVisibility(0);
          com.tencent.mm.ui.f.a.a.a((ImageView)localObject2, (String)localObject5);
        }
        if ((localObject1 != null) && (localObject3 != null))
        {
          localObject5 = (TextView)((LinearLayout)localObject1).findViewById(a.g.geB);
          ((TextView)localObject5).setVisibility(0);
          localObject2 = localObject3;
          if (this.waI != null) {
            localObject2 = this.waI.a(((CharSequence)localObject3).toString(), this.kHZ.getTextSize());
          }
          ((TextView)localObject5).setText((CharSequence)localObject2);
        }
        if ((Boolean.valueOf(bool).booleanValue()) && (localObject1 != null))
        {
          localObject2 = (ImageView)((LinearLayout)localObject1).findViewById(a.g.gdq);
          ((ImageView)localObject2).setVisibility(0);
          BK(0);
          ((LinearLayout)localObject1).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(3172638654464L, 23638);
              if (localObject4 != null) {
                localObject4.bLD();
              }
              if (localObject2.isSelected())
              {
                i.c(i.this).startAnimation(i.b(i.this));
                i.b(i.this).setAnimationListener(new Animation.AnimationListener()
                {
                  public final void onAnimationEnd(Animation paramAnonymous2Animation)
                  {
                    GMTrace.i(3368999190528L, 25101);
                    i.c(i.this).setVisibility(8);
                    i.a(i.this, 0);
                    GMTrace.o(3368999190528L, 25101);
                  }
                  
                  public final void onAnimationRepeat(Animation paramAnonymous2Animation)
                  {
                    GMTrace.i(3369133408256L, 25102);
                    GMTrace.o(3369133408256L, 25102);
                  }
                  
                  public final void onAnimationStart(Animation paramAnonymous2Animation)
                  {
                    GMTrace.i(3368864972800L, 25100);
                    i.a(i.this, i.d(i.this));
                    GMTrace.o(3368864972800L, 25100);
                  }
                });
                ObjectAnimator.ofFloat(localObject2, "rotation", new float[] { 180.0F, 0.0F }).setDuration(200L).start();
                localObject2.setSelected(false);
                GMTrace.o(3172638654464L, 23638);
                return;
              }
              i.c(i.this).startAnimation(i.e(i.this));
              i.e(i.this).setAnimationListener(new Animation.AnimationListener()
              {
                public final void onAnimationEnd(Animation paramAnonymous2Animation)
                {
                  GMTrace.i(3269275418624L, 24358);
                  i.c(i.this).setVisibility(0);
                  i.a(i.this, 8);
                  GMTrace.o(3269275418624L, 24358);
                }
                
                public final void onAnimationRepeat(Animation paramAnonymous2Animation)
                {
                  GMTrace.i(3269409636352L, 24359);
                  GMTrace.o(3269409636352L, 24359);
                }
                
                public final void onAnimationStart(Animation paramAnonymous2Animation)
                {
                  GMTrace.i(3269141200896L, 24357);
                  i.a(i.this, i.f(i.this));
                  GMTrace.o(3269141200896L, 24357);
                }
              });
              ObjectAnimator.ofFloat(localObject2, "rotation", new float[] { 0.0F, 180.0F }).setDuration(200L).start();
              localObject2.setSelected(true);
              GMTrace.o(3172638654464L, 23638);
            }
          });
        }
        if (paramc.vYr != null)
        {
          localObject1 = paramc.vYr;
          if ((this.vKn == null) || (this.vKn.getVisibility() != 0)) {
            break label2122;
          }
          this.vKn.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(3282697191424L, 24458);
              if (localObject1 != null) {
                localObject1.azi();
              }
              GMTrace.o(3282697191424L, 24458);
            }
          });
        }
        if (paramc.vYm != null) {
          cz(paramc.vYm);
        }
        if ((paramc.vYv != null) && (!paramc.vYv.isRecycled()))
        {
          localObject2 = paramc.vYv;
          bool = paramc.vYD;
          i1 = paramc.vYK;
          if (localObject2 != null)
          {
            lw(false);
            this.vKn.setVisibility(0);
            this.vKn.setGravity(1);
            this.vKn.setPadding(0, 0, 0, 0);
            localObject4 = View.inflate(this.mContext, a.h.geO, null);
            localObject5 = (ImageView)((View)localObject4).findViewById(a.g.bNn);
            if (!bool) {
              break label2317;
            }
            i = ((Bitmap)localObject2).getWidth();
            j = ((Bitmap)localObject2).getHeight();
            localObject3 = null;
            f = j / i;
            j = com.tencent.mm.br.a.W(this.mContext, a.e.gcy);
            i = com.tencent.mm.br.a.W(this.mContext, a.e.gcx);
            if ((f <= 0.0F) || (f >= 0.5D)) {
              break label2149;
            }
            k = (int)(j / f);
            m = j;
            localObject1 = localObject3;
            if (m > 0)
            {
              localObject1 = localObject3;
              if (k > 0)
              {
                localObject1 = localObject3;
                if (localObject2 != null)
                {
                  localObject1 = Bitmap.createScaledBitmap((Bitmap)localObject2, k, m, true);
                  ((ImageView)localObject5).setLayoutParams(new FrameLayout.LayoutParams(i, j));
                }
              }
            }
            localObject1 = d.a((Bitmap)localObject1, true, com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 3));
            ((ImageView)localObject5).setImageBitmap((Bitmap)localObject1);
            localObject1 = (ImageView)((View)localObject4).findViewById(a.g.gdp);
            if (i1 != 0) {
              break label2251;
            }
            ((ImageView)localObject1).setVisibility(8);
            H((View)localObject4, -2);
          }
        }
        if ((paramc.vYh != null) && (paramc.vYh.length() > 0))
        {
          localObject1 = paramc.vYh;
          if (localObject1 != null)
          {
            this.waw.setVisibility(0);
            this.waw.setText((CharSequence)localObject1);
          }
          this.waC = true;
          i = paramc.vYJ;
          if (this.waw != null) {
            this.waw.setGravity(i);
          }
        }
        if ((paramc.vYi != null) && (paramc.vYi.length() > 0))
        {
          localObject1 = paramc.vYi;
          this.jZ.setVisibility(0);
          this.jZ.setHint((CharSequence)localObject1);
        }
        if ((paramc.vYj != null) && (paramc.vYj.length() > 0))
        {
          localObject1 = paramc.vYj;
          this.JS.setVisibility(0);
          this.JS.setText((CharSequence)localObject1);
        }
        if (paramc.vYk)
        {
          this.waD = paramc.vYk;
          if (!paramc.vYk) {
            break label2291;
          }
          this.jZ.setVisibility(0);
        }
        if ((paramc.vYz != null) && (paramc.vYz.length() > 0)) {
          a(paramc.vYz, paramc.vYM, paramc.vYE);
        }
        if ((paramc.vYA != null) && (paramc.vYA.length() > 0)) {
          b(paramc.vYA, true, paramc.vYF);
        }
        if (paramc.Fj != null) {
          setOnCancelListener(paramc.Fj);
        }
        if (paramc.Fk != null) {
          setOnDismissListener(paramc.Fk);
        }
        if (paramc.vYs != null) {
          this.waI = paramc.vYs;
        }
        setCancelable(paramc.oND);
        this.oND = paramc.oND;
        if (!this.oND) {
          super.setCancelable(paramc.vYB);
        }
        if (paramc.vYp)
        {
          localObject1 = v.fb(getContext()).inflate(a.h.geL, null);
          this.kVx = ((Button)((View)localObject1).findViewById(a.g.bNg));
          this.rot = ((Button)((View)localObject1).findViewById(a.g.bNq));
          if ((paramc.vYz != null) && (paramc.vYz.length() > 0)) {
            a(paramc.vYz, paramc.vYM, paramc.vYE);
          }
          if ((paramc.vYA != null) && (paramc.vYA.length() > 0)) {
            b(paramc.vYA, true, paramc.vYF);
          }
          paramc = new LinearLayout.LayoutParams(-1, -1);
          this.waB.setVisibility(8);
          this.waz.removeAllViews();
          this.waz.addView((View)localObject1, paramc);
        }
        GMTrace.o(3272228208640L, 24380);
        return;
        lw(false);
        break;
        if (paramc.vYO)
        {
          localObject1 = paramc.vYu;
          localObject3 = paramc.vYx;
          localObject2 = paramc.vYy;
          localObject4 = v.fb(this.mContext).inflate(a.h.geN, null);
          if (localObject1 != null)
          {
            localObject5 = (ImageView)((View)localObject4).findViewById(a.g.bNn);
            ((ImageView)localObject5).setVisibility(0);
            ((ImageView)localObject5).setImageBitmap((Bitmap)localObject1);
          }
          if (localObject3 != null)
          {
            localObject5 = (TextView)((View)localObject4).findViewById(a.g.gdx);
            ((TextView)localObject5).setVisibility(0);
            localObject1 = localObject3;
            if (this.waI != null) {
              localObject1 = this.waI.a(((CharSequence)localObject3).toString(), ((TextView)localObject5).getTextSize());
            }
            ((TextView)localObject5).setText((CharSequence)localObject1);
          }
          if (localObject2 != null)
          {
            localObject3 = (TextView)((View)localObject4).findViewById(a.g.bNo);
            ((TextView)localObject3).setVisibility(0);
            if (this.waI == null) {
              break label2324;
            }
            localObject1 = this.waI.a(((CharSequence)localObject2).toString(), ((TextView)localObject3).getTextSize());
            ((TextView)localObject3).setText((CharSequence)localObject1);
          }
          H((View)localObject4, -1);
        }
      }
    }
  }
  
  public final void a(CharSequence paramCharSequence, final boolean paramBoolean, final DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3271154466816L, 24372);
    if (this.rot == null)
    {
      GMTrace.o(3271154466816L, 24372);
      return;
    }
    this.rot.setVisibility(0);
    this.rot.setText(paramCharSequence);
    this.rot.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3244445138944L, 24173);
        if (paramOnClickListener != null) {
          paramOnClickListener.onClick(i.this, -1);
        }
        if (paramBoolean) {
          i.this.dismiss();
        }
        GMTrace.o(3244445138944L, 24173);
      }
    });
    GMTrace.o(3271154466816L, 24372);
  }
  
  public final void b(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(16765002186752L, 124909);
    b(this.mContext.getString(paramInt), true, paramOnClickListener);
    GMTrace.o(16765002186752L, 124909);
  }
  
  public final void b(CharSequence paramCharSequence, final boolean paramBoolean, final DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3271691337728L, 24376);
    if (this.kVx == null)
    {
      GMTrace.o(3271691337728L, 24376);
      return;
    }
    this.kVx.setVisibility(0);
    this.kVx.setText(paramCharSequence);
    this.kVx.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3178141581312L, 23679);
        if (paramOnClickListener != null) {
          paramOnClickListener.onClick(i.this, -2);
        }
        if (paramBoolean) {
          i.this.cancel();
        }
        GMTrace.o(3178141581312L, 23679);
      }
    });
    GMTrace.o(3271691337728L, 24376);
  }
  
  public final String bZA()
  {
    GMTrace.i(3270483378176L, 24367);
    if (this.jZ == null)
    {
      GMTrace.o(3270483378176L, 24367);
      return null;
    }
    String str = this.jZ.getText().toString();
    GMTrace.o(3270483378176L, 24367);
    return str;
  }
  
  public final int bZB()
  {
    GMTrace.i(3270617595904L, 24368);
    if ((this.jZ instanceof PasterEditText))
    {
      int i = ((PasterEditText)this.jZ).boQ();
      GMTrace.o(3270617595904L, 24368);
      return i;
    }
    GMTrace.o(3270617595904L, 24368);
    return 0;
  }
  
  public void dismiss()
  {
    GMTrace.i(3272496644096L, 24382);
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3180691718144L, 23698);
          i.this.dismiss();
          GMTrace.o(3180691718144L, 23698);
        }
      });
      w.e("MicroMsg.MMAlertDialog", bg.bQW().toString());
      GMTrace.o(3272496644096L, 24382);
      return;
    }
    try
    {
      super.dismiss();
      GMTrace.o(3272496644096L, 24382);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMAlertDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(3272496644096L, 24382);
    }
  }
  
  public final Button getButton(int paramInt)
  {
    GMTrace.i(3272093990912L, 24379);
    switch (paramInt)
    {
    default: 
      GMTrace.o(3272093990912L, 24379);
      return null;
    case -1: 
      localButton = this.rot;
      GMTrace.o(3272093990912L, 24379);
      return localButton;
    }
    Button localButton = this.kVx;
    GMTrace.o(3272093990912L, 24379);
    return localButton;
  }
  
  public View getContentView()
  {
    GMTrace.i(18742163537920L, 139640);
    LinearLayout localLinearLayout = this.vKk;
    GMTrace.o(18742163537920L, 139640);
    return localLinearLayout;
  }
  
  public final void lx(boolean paramBoolean)
  {
    GMTrace.i(3271959773184L, 24378);
    super.setCancelable(false);
    GMTrace.o(3271959773184L, 24378);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3269812289536L, 24362);
    super.onCreate(paramBundle);
    setContentView(this.vKk);
    GMTrace.o(3269812289536L, 24362);
  }
  
  public void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(3271825555456L, 24377);
    super.setCancelable(paramBoolean);
    this.oND = paramBoolean;
    setCanceledOnTouchOutside(this.oND);
    GMTrace.o(3271825555456L, 24377);
  }
  
  public final void setMessage(CharSequence paramCharSequence)
  {
    GMTrace.i(3270214942720L, 24365);
    this.vKn.setVisibility(0);
    this.vKl.setVisibility(0);
    Object localObject = paramCharSequence;
    if (this.waI != null)
    {
      localObject = this.waI;
      this.vKl.getContext();
      localObject = ((i.a.c)localObject).a(paramCharSequence.toString(), this.vKl.getTextSize());
    }
    this.vKl.setText((CharSequence)localObject);
    GMTrace.o(3270214942720L, 24365);
  }
  
  public void setTitle(int paramInt)
  {
    GMTrace.i(3270080724992L, 24364);
    this.iIG.setVisibility(0);
    this.kHZ.setVisibility(0);
    this.kHZ.setMaxLines(2);
    this.kHZ.setText(paramInt);
    AS(a.d.gcl);
    GMTrace.o(3270080724992L, 24364);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(3269946507264L, 24363);
    this.iIG.setVisibility(0);
    this.kHZ.setVisibility(0);
    CharSequence localCharSequence = paramCharSequence;
    if (this.waI != null) {
      localCharSequence = this.waI.a(paramCharSequence.toString(), this.kHZ.getTextSize());
    }
    this.kHZ.setMaxLines(2);
    this.kHZ.setText(localCharSequence);
    AS(a.d.gcl);
    GMTrace.o(3269946507264L, 24363);
  }
  
  public void show()
  {
    GMTrace.i(3272362426368L, 24381);
    try
    {
      super.show();
      GMTrace.o(3272362426368L, 24381);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.MMAlertDialog", localException, "", new Object[0]);
      GMTrace.o(3272362426368L, 24381);
    }
  }
  
  public static class a
  {
    private Context mContext;
    public c waR;
    
    public a(Context paramContext)
    {
      GMTrace.i(3361214562304L, 25043);
      this.mContext = paramContext;
      this.waR = new c();
      GMTrace.o(3361214562304L, 25043);
    }
    
    public final a BN(int paramInt)
    {
      GMTrace.i(3361482997760L, 25045);
      this.waR.title = this.mContext.getString(paramInt);
      GMTrace.o(3361482997760L, 25045);
      return this;
    }
    
    public final a BO(int paramInt)
    {
      GMTrace.i(3361751433216L, 25047);
      this.waR.vYw = this.mContext.getString(paramInt);
      GMTrace.o(3361751433216L, 25047);
      return this;
    }
    
    public final a BP(int paramInt)
    {
      GMTrace.i(3362422521856L, 25052);
      this.waR.vYJ = paramInt;
      GMTrace.o(3362422521856L, 25052);
      return this;
    }
    
    public final a BQ(int paramInt)
    {
      GMTrace.i(3362959392768L, 25056);
      this.waR.vYz = this.mContext.getString(paramInt);
      GMTrace.o(3362959392768L, 25056);
      return this;
    }
    
    public final a BR(int paramInt)
    {
      GMTrace.i(3363496263680L, 25060);
      this.waR.vYA = this.mContext.getString(paramInt);
      GMTrace.o(3363496263680L, 25060);
      return this;
    }
    
    public final a O(CharSequence paramCharSequence)
    {
      GMTrace.i(16173907312640L, 120505);
      this.waR.title = paramCharSequence;
      GMTrace.o(16173907312640L, 120505);
      return this;
    }
    
    public final a P(CharSequence paramCharSequence)
    {
      GMTrace.i(3361885650944L, 25048);
      this.waR.vYx = paramCharSequence;
      GMTrace.o(3361885650944L, 25048);
      return this;
    }
    
    public final a VA(String paramString)
    {
      GMTrace.i(3361617215488L, 25046);
      this.waR.vYw = paramString;
      GMTrace.o(3361617215488L, 25046);
      return this;
    }
    
    public final a VB(String paramString)
    {
      GMTrace.i(3362556739584L, 25053);
      this.waR.vYi = paramString;
      GMTrace.o(3362556739584L, 25053);
      return this;
    }
    
    public final a VC(String paramString)
    {
      GMTrace.i(3362825175040L, 25055);
      this.waR.vYz = paramString;
      GMTrace.o(3362825175040L, 25055);
      return this;
    }
    
    public final a VD(String paramString)
    {
      GMTrace.i(3363362045952L, 25059);
      this.waR.vYA = paramString;
      GMTrace.o(3363362045952L, 25059);
      return this;
    }
    
    public final a Vz(String paramString)
    {
      GMTrace.i(3361348780032L, 25044);
      this.waR.title = paramString;
      GMTrace.o(3361348780032L, 25044);
      return this;
    }
    
    public final a a(DialogInterface.OnClickListener paramOnClickListener)
    {
      GMTrace.i(3363093610496L, 25057);
      this.waR.vYE = paramOnClickListener;
      GMTrace.o(3363093610496L, 25057);
      return this;
    }
    
    public final a a(DialogInterface.OnDismissListener paramOnDismissListener)
    {
      GMTrace.i(3363898916864L, 25063);
      this.waR.Fk = paramOnDismissListener;
      GMTrace.o(3363898916864L, 25063);
      return this;
    }
    
    public final a a(Bitmap paramBitmap, boolean paramBoolean, int paramInt)
    {
      GMTrace.i(3362288304128L, 25051);
      this.waR.vYv = paramBitmap;
      this.waR.vYD = paramBoolean;
      this.waR.vYK = paramInt;
      GMTrace.o(3362288304128L, 25051);
      return this;
    }
    
    public final a a(c paramc)
    {
      GMTrace.i(21006685044736L, 156512);
      this.waR.vYs = paramc;
      GMTrace.o(21006685044736L, 156512);
      return this;
    }
    
    public final a a(String paramString, CharSequence paramCharSequence, Boolean paramBoolean, b paramb)
    {
      GMTrace.i(3362154086400L, 25050);
      this.waR.vYl = paramString;
      this.waR.vYn = paramCharSequence;
      this.waR.vYo = paramBoolean.booleanValue();
      this.waR.vYq = paramb;
      GMTrace.o(3362154086400L, 25050);
      return this;
    }
    
    public final a a(boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
    {
      GMTrace.i(3363227828224L, 25058);
      this.waR.vYE = paramOnClickListener;
      this.waR.vYM = paramBoolean;
      GMTrace.o(3363227828224L, 25058);
      return this;
    }
    
    public i aax()
    {
      GMTrace.i(3364301570048L, 25066);
      i locali = new i(this.mContext);
      locali.a(this.waR);
      GMTrace.o(3364301570048L, 25066);
      return locali;
    }
    
    public final a b(DialogInterface.OnClickListener paramOnClickListener)
    {
      GMTrace.i(3363630481408L, 25061);
      this.waR.vYF = paramOnClickListener;
      GMTrace.o(3363630481408L, 25061);
      return this;
    }
    
    public final a bZC()
    {
      GMTrace.i(3364435787776L, 25067);
      this.waR.vYp = true;
      GMTrace.o(3364435787776L, 25067);
      return this;
    }
    
    public final a d(DialogInterface.OnCancelListener paramOnCancelListener)
    {
      GMTrace.i(3363764699136L, 25062);
      this.waR.Fj = paramOnCancelListener;
      GMTrace.o(3363764699136L, 25062);
      return this;
    }
    
    public final a dg(View paramView)
    {
      GMTrace.i(3362690957312L, 25054);
      this.waR.rLg = paramView;
      GMTrace.o(3362690957312L, 25054);
      return this;
    }
    
    public final a lA(boolean paramBoolean)
    {
      GMTrace.i(3364167352320L, 25065);
      this.waR.vYB = paramBoolean;
      GMTrace.o(3364167352320L, 25065);
      return this;
    }
    
    public final a ly(boolean paramBoolean)
    {
      GMTrace.i(3362019868672L, 25049);
      this.waR.vYC = paramBoolean;
      GMTrace.o(3362019868672L, 25049);
      return this;
    }
    
    public final a lz(boolean paramBoolean)
    {
      GMTrace.i(3364033134592L, 25064);
      this.waR.oND = paramBoolean;
      GMTrace.o(3364033134592L, 25064);
      return this;
    }
    
    public static abstract interface a
    {
      public abstract void azi();
    }
    
    public static abstract interface b
    {
      public abstract void bLD();
    }
    
    public static abstract interface c
    {
      public abstract CharSequence a(CharSequence paramCharSequence, float paramFloat);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */