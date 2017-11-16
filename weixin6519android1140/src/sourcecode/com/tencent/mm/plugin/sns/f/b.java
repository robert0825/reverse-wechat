package com.tencent.mm.plugin.sns.f;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.model.t;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.ui.SnsCommentUI;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class b
  implements com.tencent.mm.plugin.sns.model.e
{
  private boolean eEu;
  public Context mContext;
  private int pnx;
  public final int pxD;
  private com.tencent.mm.plugin.sns.ui.b.b pxE;
  private FrameLayout pxF;
  AbsoluteLayout pxG;
  protected Animation pxH;
  protected Animation pxI;
  public boolean pxJ;
  int[] pxK;
  private int[] pxL;
  private int[] pxM;
  private int[] pxN;
  private int[] pxO;
  public Map<Long, b> pxP;
  private Map<Long, b> pxQ;
  private HashSet<Long> pxR;
  public h pxS;
  private HashMap<Long, Boolean> pxT;
  
  public b(Context paramContext, com.tencent.mm.plugin.sns.ui.b.b paramb, FrameLayout paramFrameLayout)
  {
    GMTrace.i(8778778935296L, 65407);
    this.pxD = 14;
    this.pxG = null;
    this.pxJ = false;
    this.pxK = new int[] { i.j.pip, i.j.piq, i.j.pir, i.j.pis };
    this.pxL = new int[] { i.i.pgV, i.i.pgX, i.i.pgW, i.i.pgU };
    this.pxM = this.pxK;
    this.eEu = true;
    this.pxP = new HashMap();
    this.pxQ = new HashMap();
    this.pxR = new HashSet();
    this.pxS = null;
    this.pxT = new HashMap();
    this.pnx = -1;
    g localg = com.tencent.mm.plugin.sns.model.ae.biV();
    h localh2 = new h();
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100007");
    h localh1;
    if (!localc.isValid())
    {
      w.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
      localh1 = null;
    }
    for (;;)
    {
      localg.pyT = localh1;
      this.pxS = com.tencent.mm.plugin.sns.model.ae.biV().bjW();
      if (this.pxS != null)
      {
        this.pxN = this.pxS.pyV;
        if (!this.pxS.bjX()) {
          this.eEu = false;
        }
      }
      this.mContext = paramContext;
      this.pxE = paramb;
      this.pxF = paramFrameLayout;
      this.pxH = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F, 1, 1.0F, 1, 0.0F);
      this.pxH = AnimationUtils.loadAnimation(paramContext, i.a.oWU);
      this.pxI = new ScaleAnimation(1.0F, 1.0F, 1.0F, 0.0F, 1, 1.0F, 1, 0.0F);
      this.pxI = AnimationUtils.loadAnimation(paramContext, i.a.oWV);
      GMTrace.o(8778778935296L, 65407);
      return;
      Map localMap = localc.bSg();
      localh1 = localh2;
      if (localMap != null)
      {
        w.i("MicroMsg.SnsABTestStrategy", "snsabtest feed " + localc.field_expId + " " + localc.field_layerId + " " + localc.field_startTime + " " + localc.field_endTime);
        localh2.e(localc.field_layerId, localc.field_expId, localMap);
        localh1 = localh2;
      }
    }
  }
  
  private static String a(a parama, Map<String, String> paramMap)
  {
    GMTrace.i(8779181588480L, 65410);
    if (parama == null)
    {
      GMTrace.o(8779181588480L, 65410);
      return "";
    }
    StringBuffer localStringBuffer2;
    StringBuffer localStringBuffer1;
    int i;
    label57:
    char c;
    if (com.tencent.mm.sdk.platformtools.v.bPH())
    {
      parama = parama.pxz;
      localStringBuffer2 = new StringBuffer();
      localStringBuffer1 = new StringBuffer();
      i = 0;
      if (i >= parama.length()) {
        break label232;
      }
      c = parama.charAt(i);
      if (c != '$') {
        break label204;
      }
      if (localStringBuffer1.length() != 0) {
        break label121;
      }
      localStringBuffer1.append(c);
    }
    for (;;)
    {
      i += 1;
      break label57;
      if (com.tencent.mm.sdk.platformtools.v.bPI())
      {
        parama = parama.pxA;
        break;
      }
      parama = parama.pxB;
      break;
      label121:
      if (localStringBuffer1.charAt(localStringBuffer1.length() - 1) == '$')
      {
        localStringBuffer2.append('$');
        localStringBuffer1 = new StringBuffer();
      }
      else
      {
        String str = (String)paramMap.get(localStringBuffer1.substring(1));
        if (str == null)
        {
          GMTrace.o(8779181588480L, 65410);
          return "";
        }
        localStringBuffer2.append(str);
        continue;
        label204:
        if (localStringBuffer1.length() == 0) {
          localStringBuffer2.append(c);
        } else {
          localStringBuffer1.append(c);
        }
      }
    }
    label232:
    parama = localStringBuffer2.toString();
    GMTrace.o(8779181588480L, 65410);
    return parama;
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, biz parambiz, boolean paramBoolean)
  {
    GMTrace.i(8778510499840L, 65405);
    if ((paramBoolean) && (this.eEu))
    {
      if (this.pxR.contains(Long.valueOf(paramLong)))
      {
        paramBoolean = false;
        if (this.pxT.containsKey(Long.valueOf(paramLong))) {
          paramBoolean = ((Boolean)this.pxT.get(Long.valueOf(paramLong))).booleanValue();
        }
        if (paramBoolean)
        {
          paramString1 = (b)this.pxQ.get(Long.valueOf(paramLong));
          if (paramString1 != null) {
            paramString1.rw();
          }
        }
      }
      this.pxQ.remove(Long.valueOf(paramLong));
      this.pxR.remove(Long.valueOf(paramLong));
    }
    GMTrace.o(8778510499840L, 65405);
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, biz parambiz, boolean paramBoolean, bf parambf)
  {
    GMTrace.i(8778376282112L, 65404);
    if ((paramBoolean) && (this.eEu) && (this.pxS != null) && (parambf != null))
    {
      this.pxR.add(Long.valueOf(paramLong));
      paramString1 = new b(paramLong, this.pxS.pyf, this.pxS.pyg, parambf.bpS());
      this.pxQ.put(Long.valueOf(paramLong), paramString1);
    }
    GMTrace.o(8778376282112L, 65404);
  }
  
  final void a(View paramView, AbsoluteLayout paramAbsoluteLayout, final com.tencent.mm.plugin.sns.data.b paramb)
  {
    GMTrace.i(8779047370752L, 65409);
    Object localObject1 = (ViewGroup)paramView;
    ((ViewGroup)localObject1).removeAllViews();
    if (this.pxS == null)
    {
      GMTrace.o(8779047370752L, 65409);
      return;
    }
    if ((paramb.poY == null) || (paramb.poY.qjF == null))
    {
      GMTrace.o(8779047370752L, 65409);
      return;
    }
    Object localObject2 = paramb.poY.qjF;
    Object localObject3 = new Paint(1);
    int n = BackwardSupportUtil.b.a(this.mContext, 12.0F);
    int i1 = BackwardSupportUtil.b.a(this.mContext, 10.0F);
    int k = BackwardSupportUtil.b.a(this.mContext, 150.0F);
    LinkedList localLinkedList = new LinkedList();
    float f = BackwardSupportUtil.b.a(this.mContext, 17.0F) * com.tencent.mm.br.a.dZ(this.mContext) + i1 * 2;
    int m = (int)f;
    int i = 0;
    int j = 0;
    while (j < this.pxS.pyI.size())
    {
      Object localObject4 = (a)this.pxS.pyI.get(j);
      final TextView localTextView = new TextView(this.mContext);
      localTextView.setPadding(n, i1, n, i1);
      localTextView.setTextSize(1, 14.0F * com.tencent.mm.br.a.dZ(this.mContext));
      localTextView.setTextColor(this.mContext.getResources().getColor(i.c.oXb));
      localObject4 = a((a)localObject4, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDe);
      localTextView.setText((CharSequence)localObject4);
      ((Paint)localObject3).setTextSize(localTextView.getTextSize());
      ((ViewGroup)localObject1).addView(localTextView);
      i = Math.max(i, (int)((Paint)localObject3).measureText((String)localObject4) + n * 2);
      localTextView.setTag(Integer.valueOf(j));
      localLinkedList.add(localTextView);
      localTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8769652129792L, 65339);
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          paramAnonymousView = (b.b)b.this.pxP.get(Long.valueOf(paramb.poZ));
          int j = ((a)b.this.pxS.pyI.get(i)).pxy;
          if (paramAnonymousView != null) {
            paramAnonymousView.HW("3:" + j + ":" + localTextView.getText());
          }
          if (((a)b.this.pxS.pyI.get(i)).pxC == 1)
          {
            Intent localIntent = new Intent();
            localIntent.setClass(b.this.mContext, SnsCommentUI.class);
            localIntent.putExtra("sns_comment_type", 2);
            localIntent.putExtra("sns_id", paramb.poZ);
            localIntent.putExtra("sns_uxinfo", paramAnonymousView.pyc);
            localIntent.putExtra("action_st_time", paramAnonymousView.pyd);
            localIntent.putExtra("sns_actionresult", paramAnonymousView.pyb.toString());
            ((MMActivity)b.this.mContext).startActivity(localIntent);
            b.this.pxP.remove(Long.valueOf(paramb.poZ));
            b.this.bjU();
            GMTrace.o(8769652129792L, 65339);
            return;
          }
          b.this.a(paramAnonymousView);
          b.this.bjU();
          GMTrace.o(8769652129792L, 65339);
        }
      });
      j += 1;
    }
    w.i("MicroMsg.AdNotLikeAbTestHelper", "w h " + i + " " + m);
    j = i;
    if (i < k) {
      j = k;
    }
    localObject1 = localLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (TextView)((Iterator)localObject1).next();
      localObject3 = ((TextView)localObject2).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject3).width = j;
      ((ViewGroup.LayoutParams)localObject3).height = ((int)f);
      ((TextView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    }
    new Rect();
    k = com.tencent.mm.pluginsdk.e.dG(this.mContext);
    localObject1 = paramb.poY.bpT();
    n = BackwardSupportUtil.b.a(this.mContext, 2.0F);
    i1 = localObject1[0];
    int i2 = localObject1[1];
    int i3 = this.pnx;
    paramb = paramb.poY;
    if (paramb.qjB != null) {}
    for (i = paramb.qjB.getHeight();; i = 0)
    {
      paramAbsoluteLayout.updateViewLayout(paramView, new AbsoluteLayout.LayoutParams(-2, -2, i1 - j - n, i2 - i3 - k + m - i));
      GMTrace.o(8779047370752L, 65409);
      return;
    }
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(8778644717568L, 65406);
    this.pxP.remove(Long.valueOf(paramb.gVt));
    paramb.rw();
    GMTrace.o(8778644717568L, 65406);
  }
  
  public final boolean bjU()
  {
    int j = 0;
    GMTrace.i(8779315806208L, 65411);
    if (this.pxG != null)
    {
      Object localObject;
      int i;
      if ((this.pxG.getTag() instanceof a))
      {
        localObject = (a)this.pxG.getTag();
        localObject = (b)this.pxP.get(Long.valueOf(((a)localObject).poZ));
        if (localObject != null)
        {
          if ((((b)localObject).pyb != null) && (((b)localObject).pyb.length() != 0)) {
            break label153;
          }
          i = 0;
          if (i == 0) {
            break label181;
          }
          i = j;
          if (((b)localObject).pyb != null)
          {
            if (((b)localObject).pyb.length() != 0) {
              break label158;
            }
            i = j;
          }
          label110:
          if (i != 0) {
            ((b)localObject).HW("2:0:");
          }
          a((b)localObject);
        }
      }
      for (;;)
      {
        this.pxF.removeView(this.pxG);
        this.pxG = null;
        GMTrace.o(8779315806208L, 65411);
        return true;
        label153:
        i = 1;
        break;
        label158:
        i = j;
        if (!((b)localObject).pyb.toString().startsWith("1:0")) {
          break label110;
        }
        i = 1;
        break label110;
        label181:
        ((b)localObject).HW("2:0:");
        a((b)localObject);
      }
    }
    this.pxJ = false;
    GMTrace.o(8779315806208L, 65411);
    return false;
  }
  
  public final void c(View paramView1, View paramView2)
  {
    GMTrace.i(16046803124224L, 119558);
    paramView1.getTag();
    paramView2.setVisibility(0);
    this.pxJ = true;
    this.pxH.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8777436758016L, 65397);
        b.this.pxJ = false;
        GMTrace.o(8777436758016L, 65397);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8777570975744L, 65398);
        GMTrace.o(8777570975744L, 65398);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8777302540288L, 65396);
        b.this.pxJ = true;
        GMTrace.o(8777302540288L, 65396);
      }
    });
    paramView2.startAnimation(this.pxH);
    GMTrace.o(16046803124224L, 119558);
  }
  
  public final int ct(final View paramView)
  {
    GMTrace.i(8778913153024L, 65408);
    if (this.pxJ)
    {
      GMTrace.o(8778913153024L, 65408);
      return 0;
    }
    if (this.pxG != null)
    {
      if ((this.pxG.getTag() instanceof a))
      {
        paramView = ((a)this.pxG.getTag()).pmD;
        this.pxJ = true;
        paramView.startAnimation(this.pxI);
        this.pxI.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8769383694336L, 65337);
            if (paramView != null)
            {
              paramView.clearAnimation();
              paramView.setVisibility(8);
              b.this.bjU();
            }
            b.this.pxJ = false;
            GMTrace.o(8769383694336L, 65337);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8769249476608L, 65336);
            GMTrace.o(8769249476608L, 65336);
          }
          
          public final void onAnimationStart(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8769115258880L, 65335);
            b.this.pxJ = true;
            GMTrace.o(8769115258880L, 65335);
          }
        });
      }
      for (;;)
      {
        GMTrace.o(8778913153024L, 65408);
        return 0;
        bjU();
      }
    }
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
    {
      GMTrace.o(8778913153024L, 65408);
      return 0;
    }
    if ((!this.eEu) || (this.pxS == null))
    {
      GMTrace.o(8778913153024L, 65408);
      return 2;
    }
    final Object localObject1 = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
    long l = ((com.tencent.mm.plugin.sns.data.b)localObject1).poZ;
    Object localObject2 = ((com.tencent.mm.plugin.sns.data.b)localObject1).poY.qjF;
    boolean bool;
    if (this.pxT.containsKey(Long.valueOf(l))) {
      bool = ((Boolean)this.pxT.get(Long.valueOf(l))).booleanValue();
    }
    while (!bool)
    {
      GMTrace.o(8778913153024L, 65408);
      return 2;
      if (this.pxS == null)
      {
        bool = false;
      }
      else if (localObject2 == null)
      {
        bool = false;
      }
      else
      {
        i = 0;
        for (;;)
        {
          if (i >= this.pxS.pyI.size()) {
            break label341;
          }
          if (bg.nm(a((a)this.pxS.pyI.get(i), ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDe)))
          {
            this.pxT.put(Long.valueOf(l), Boolean.valueOf(false));
            bool = false;
            break;
          }
          i += 1;
        }
        label341:
        this.pxT.put(Long.valueOf(l), Boolean.valueOf(true));
        bool = true;
      }
    }
    localObject2 = ((com.tencent.mm.plugin.sns.data.b)localObject1).eEM;
    final Object localObject3 = new b(((com.tencent.mm.plugin.sns.data.b)localObject1).poZ, ((com.tencent.mm.plugin.sns.data.b)localObject1).poY.bpS(), this.pxS.pyf, this.pxS.pyg, this.mContext.getString(i.j.piw));
    this.pxP.put(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).poZ), localObject3);
    if (this.pxR.contains(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).poZ))) {
      this.pxR.remove(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).poZ));
    }
    this.pxG = new AbsoluteLayout(this.mContext);
    this.pxG.setId(i.f.coT);
    new FrameLayout.LayoutParams(-1, -1);
    this.pxF.addView(this.pxG);
    localObject3 = com.tencent.mm.ui.v.fb(this.mContext).inflate(i.g.peM, null);
    Object localObject4 = new TextView[3];
    ImageView[] arrayOfImageView = new ImageView[3];
    localObject4[0] = ((TextView)((View)localObject3).findViewById(i.f.oYN));
    localObject4[1] = ((TextView)((View)localObject3).findViewById(i.f.oYS));
    localObject4[2] = ((TextView)((View)localObject3).findViewById(i.f.oYR));
    arrayOfImageView[0] = ((ImageView)((View)localObject3).findViewById(i.f.oYO));
    arrayOfImageView[1] = ((ImageView)((View)localObject3).findViewById(i.f.oYQ));
    arrayOfImageView[2] = ((ImageView)((View)localObject3).findViewById(i.f.oYP));
    int j = 0;
    int i = 0;
    if (!t.dD(((com.tencent.mm.plugin.sns.data.b)localObject1).poZ))
    {
      k = 0;
      for (;;)
      {
        j = i;
        if (k >= this.pxN.length) {
          break;
        }
        j = i;
        if (this.pxN[k] == 3) {
          j = i + 1;
        }
        k += 1;
        i = j;
      }
    }
    int k = 0;
    i = 0;
    while (i < this.pxN.length)
    {
      m = k;
      if (this.pxN[i] == 0) {
        m = k + 1;
      }
      i += 1;
      k = m;
    }
    if (k + j > 0)
    {
      i = this.pxN.length - k - j;
      if (i == 0)
      {
        GMTrace.o(8778913153024L, 65408);
        return 2;
      }
    }
    for (this.pxO = new int[i];; this.pxO = new int[this.pxN.length])
    {
      i = 0;
      for (k = 0; i < this.pxN.length; k = m)
      {
        m = k;
        if (this.pxN[i] != 0) {
          if (j > 0)
          {
            m = k;
            if (this.pxN[i] == 3) {}
          }
          else
          {
            this.pxO[k] = this.pxN[i];
            m = k + 1;
          }
        }
        i += 1;
      }
    }
    if (t.dC(((com.tencent.mm.plugin.sns.data.b)localObject1).poZ))
    {
      i = 0;
      if (i < this.pxO.length)
      {
        if (this.pxO[i] != 3) {
          break label1153;
        }
        this.pxO[i] = 4;
      }
    }
    i = 0;
    int m = com.tencent.mm.br.a.fromDPToPix(this.mContext, 12);
    int n = com.tencent.mm.br.a.fromDPToPix(this.mContext, 8);
    int i1 = com.tencent.mm.br.a.fromDPToPix(this.mContext, 12);
    j = 0;
    label942:
    final int i2;
    int i3;
    if (j < this.pxO.length)
    {
      i2 = this.pxO[j];
      i3 = this.pxO[j] - 1;
      localObject4[j].setText(this.pxM[i3]);
      Object localObject5 = localObject4[j];
      Paint localPaint = new Paint();
      String str = ((TextView)localObject5).getText().toString();
      localPaint.setTextSize(((TextView)localObject5).getTextSize());
      k = (int)localPaint.measureText(str, 0, str.length()) + (m * 2 + n * 2 + i1);
      if (k <= i) {
        break label1472;
      }
      i = k;
    }
    label1153:
    label1472:
    for (;;)
    {
      localObject4[j].setCompoundDrawablePadding(com.tencent.mm.br.a.fromDPToPix(this.mContext, 8));
      localObject4[j].setCompoundDrawablesWithIntrinsicBounds(this.mContext.getResources().getDrawable(this.pxL[i3]), null, null, null);
      if (i3 == 1) {
        arrayOfImageView[j].setVisibility(0);
      }
      for (;;)
      {
        localObject4[j].setTag(localObject1);
        localObject4[j].setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8770725871616L, 65347);
            b localb = b.this;
            int j = i2;
            paramAnonymousView = localObject1;
            Object localObject = localObject3;
            AbsoluteLayout localAbsoluteLayout = b.this.pxG;
            w.d("MicroMsg.AdNotLikeAbTestHelper", "processFristButtonClick " + j + " " + paramAnonymousView.poZ);
            b.b localb1 = (b.b)localb.pxP.get(Long.valueOf(paramAnonymousView.poZ));
            if (localb1 != null) {
              if (j != 4) {
                break label441;
              }
            }
            label321:
            label441:
            for (int i = 3;; i = j)
            {
              localb1.HW("1:" + i + ":" + localb.mContext.getString(localb.pxK[(j - 1)]));
              if (j == 1)
              {
                localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousView.eEM);
                if (localObject != null)
                {
                  if (((m)localObject).uX(32))
                  {
                    paramAnonymousView = ((m)localObject).blB();
                    if (paramAnonymousView != null) {
                      break label321;
                    }
                  }
                  for (paramAnonymousView = "";; paramAnonymousView = paramAnonymousView.hTy)
                  {
                    ((com.tencent.mm.plugin.sns.b.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sns.b.c.class)).a(11855, ((m)localObject).bml(), new Object[] { Integer.valueOf(3), paramAnonymousView, Integer.valueOf(((m)localObject).bml()) });
                    com.tencent.mm.plugin.sns.model.ae.bjg().delete(((m)localObject).field_snsId);
                    com.tencent.mm.plugin.sns.model.ae.bji().dP(((m)localObject).field_snsId);
                    paramAnonymousView = new q(((m)localObject).field_snsId, 8);
                    com.tencent.mm.kernel.h.xz();
                    com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
                    localb.a(localb1);
                    localb.bjU();
                    GMTrace.o(8770725871616L, 65347);
                    return;
                  }
                }
              }
              else
              {
                if (j == 2)
                {
                  localb.a((View)localObject, localAbsoluteLayout, paramAnonymousView);
                  GMTrace.o(8770725871616L, 65347);
                  return;
                }
                if (j == 3)
                {
                  if (!t.dC(paramAnonymousView.poZ)) {
                    t.dA(paramAnonymousView.poZ);
                  }
                  localb.a(localb1);
                  localb.bjU();
                  GMTrace.o(8770725871616L, 65347);
                  return;
                }
                if (j == 4)
                {
                  if (t.dC(paramAnonymousView.poZ)) {
                    t.dB(paramAnonymousView.poZ);
                  }
                  localb.a(localb1);
                  localb.bjU();
                }
              }
              GMTrace.o(8770725871616L, 65347);
              return;
            }
          }
        });
        j += 1;
        break label942;
        i += 1;
        break;
        arrayOfImageView[j].setVisibility(8);
      }
      j = 0;
      while (j < this.pxO.length)
      {
        localObject4[j].setMaxWidth(i);
        j += 1;
      }
      j = this.pxO.length;
      while (j < 3)
      {
        localObject4[j].setVisibility(8);
        j += 1;
      }
      new Rect();
      j = com.tencent.mm.pluginsdk.e.dG(this.mContext);
      localObject4 = ((com.tencent.mm.plugin.sns.data.b)localObject1).poY.bpT();
      w.d("MicroMsg.AdNotLikeAbTestHelper", "addCommentView getLocationInWindow " + localObject4[0] + "  " + localObject4[1] + " height: " + j);
      i += com.tencent.mm.br.a.fromDPToPix(this.mContext, 12);
      k = BackwardSupportUtil.b.a(this.mContext, 17.0F);
      m = BackwardSupportUtil.b.a(this.mContext, 2.0F);
      this.pnx = com.tencent.mm.pluginsdk.e.dH(this.mContext);
      localObject4 = new AbsoluteLayout.LayoutParams(i, -2, localObject4[0] - i - m, localObject4[1] - this.pnx - j + k);
      localObject1 = new a((String)localObject2, (View)localObject3, ((com.tencent.mm.plugin.sns.data.b)localObject1).poZ, ((com.tencent.mm.plugin.sns.data.b)localObject1).poY.qjF);
      this.pxG.setTag(localObject1);
      this.pxG.addView((View)localObject3, (ViewGroup.LayoutParams)localObject4);
      ((View)localObject3).setVisibility(8);
      this.pxJ = true;
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8779852677120L, 65415);
          b.this.c(paramView, localObject3);
          GMTrace.o(8779852677120L, 65415);
        }
      });
      GMTrace.o(8778913153024L, 65408);
      return 1;
    }
  }
  
  final class a
  {
    View pmD;
    long poZ;
    String pxZ;
    com.tencent.mm.plugin.sns.storage.b pya;
    
    public a(String paramString, View paramView, long paramLong, com.tencent.mm.plugin.sns.storage.b paramb)
    {
      GMTrace.i(8773276008448L, 65366);
      this.pmD = null;
      this.pxZ = paramString;
      this.pmD = paramView;
      this.pya = paramb;
      this.poZ = paramLong;
      GMTrace.o(8773276008448L, 65366);
    }
  }
  
  static final class b
  {
    long gVt;
    StringBuffer pyb;
    String pyc;
    long pyd;
    long pye;
    String pyf;
    String pyg;
    
    public b(long paramLong, String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(8771933831168L, 65356);
      this.pyb = new StringBuffer();
      this.pyc = paramString1;
      this.pyf = paramString2;
      this.pyg = paramString3;
      this.gVt = paramLong;
      this.pyd = System.currentTimeMillis();
      this.pyb.append("0:0:");
      GMTrace.o(8771933831168L, 65356);
    }
    
    public b(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      GMTrace.i(8771799613440L, 65355);
      this.pyb = new StringBuffer();
      this.pyc = paramString1;
      this.pyf = paramString2;
      this.pyg = paramString3;
      this.gVt = paramLong;
      this.pyd = System.currentTimeMillis();
      this.pyb.append("1:0:" + paramString4);
      GMTrace.o(8771799613440L, 65355);
    }
    
    public final void HW(String paramString)
    {
      GMTrace.i(8772068048896L, 65357);
      w.d("MicroMsg.AdNotLikeAbTestHelper", "addactionResult " + paramString);
      if (this.pyb.length() != 0) {
        this.pyb.append("|");
      }
      this.pyb.append(paramString);
      GMTrace.o(8772068048896L, 65357);
    }
    
    public final void rw()
    {
      GMTrace.i(8772202266624L, 65358);
      this.pye = System.currentTimeMillis();
      w.d("MicroMsg.AdNotLikeAbTestHelper", "report abtestnotlike " + this.gVt + " uxinfo:" + this.pyc + " actionresult: " + this.pyb + " " + this.pyd + " " + this.pye);
      com.tencent.mm.plugin.report.service.g.ork.i(11988, new Object[] { this.pyg, this.pyf, "", "", i.dt(this.gVt), this.pyc, this.pyb, Long.valueOf(this.pyd / 1000L), Long.valueOf(this.pye / 1000L) });
      GMTrace.o(8772202266624L, 65358);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */