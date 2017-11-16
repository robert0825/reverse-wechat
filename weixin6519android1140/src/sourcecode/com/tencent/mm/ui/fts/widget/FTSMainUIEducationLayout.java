package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class FTSMainUIEducationLayout
  extends LinearLayout
{
  protected TextView hqH;
  private float iTi;
  private float inQ;
  private float jry;
  protected View.OnClickListener oDx;
  protected List<LinearLayout> xde;
  protected Map<Integer, TextView> xdf;
  public String xdg;
  private long xdh;
  public boolean xdi;
  private TextView xdj;
  protected boolean xdk;
  public boolean xdl;
  public View.OnClickListener xdm;
  public View.OnClickListener xdn;
  
  public FTSMainUIEducationLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16179007586304L, 120543);
    this.xdf = new HashMap();
    this.xdg = "";
    this.inQ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.xdi = true;
    this.xdk = true;
    MP();
    GMTrace.o(16179007586304L, 120543);
  }
  
  public FTSMainUIEducationLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16179141804032L, 120544);
    this.xdf = new HashMap();
    this.xdg = "";
    this.inQ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.xdi = true;
    this.xdk = true;
    MP();
    GMTrace.o(16179141804032L, 120544);
  }
  
  private void MP()
  {
    GMTrace.i(16179276021760L, 120545);
    setOrientation(1);
    this.xde = new ArrayList();
    GMTrace.o(16179276021760L, 120545);
  }
  
  private void bQ(Object paramObject)
  {
    GMTrace.i(19223602528256L, 143227);
    String str;
    if ((paramObject != null) && ((paramObject instanceof JSONObject)))
    {
      str = ((JSONObject)paramObject).optString("businessType");
      if (!bg.nm(str)) {
        if (this.xdg != null) {
          break label121;
        }
      }
    }
    label121:
    for (paramObject = "";; paramObject = this.xdg)
    {
      this.xdg = ((String)paramObject);
      if (this.xdg.length() > 0) {
        this.xdg += "|";
      }
      this.xdg += str;
      GMTrace.o(19223602528256L, 143227);
      return;
    }
  }
  
  private void chE()
  {
    GMTrace.i(16795872264192L, 125139);
    Iterator localIterator = this.xde.iterator();
    while (localIterator.hasNext()) {
      removeView((LinearLayout)localIterator.next());
    }
    this.xde.clear();
    this.xdf.clear();
    this.xdg = "";
    GMTrace.o(16795872264192L, 125139);
  }
  
  private void chF()
  {
    GMTrace.i(16179812892672L, 120549);
    a(getContext().getString(R.l.dWs), null, getContext().getString(R.l.dWp), null, getContext().getString(R.l.dWq), null, a.V(getContext(), R.f.aQF));
    chG();
    GMTrace.o(16179812892672L, 120549);
  }
  
  public final void DL(int paramInt)
  {
    GMTrace.i(16796274917376L, 125142);
    Iterator localIterator = this.xdf.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Integer)localEntry.getKey()).intValue() == paramInt) {
        ((TextView)localEntry.getValue()).setTextColor(Color.parseColor("#B5B5B5"));
      } else {
        ((TextView)localEntry.getValue()).setTextColor(Color.parseColor("#45C01A"));
      }
    }
    GMTrace.o(16796274917376L, 125142);
  }
  
  public final String DM(int paramInt)
  {
    GMTrace.i(16796409135104L, 125143);
    Object localObject = (TextView)this.xdf.get(Integer.valueOf(paramInt));
    if (localObject == null)
    {
      GMTrace.o(16796409135104L, 125143);
      return "";
    }
    localObject = ((TextView)localObject).getText().toString();
    GMTrace.o(16796409135104L, 125143);
    return (String)localObject;
  }
  
  public final void I(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20400155131904L, 151993);
    w.v("MicroMsg.FTS.FTSMainUIEducationLayout", "action %d", new Object[] { Integer.valueOf(paramMotionEvent.getAction()) });
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      GMTrace.o(20400155131904L, 151993);
      return;
      Iterator localIterator = this.xdf.values().iterator();
      TextView localTextView;
      int[] arrayOfInt;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localTextView = (TextView)localIterator.next();
        arrayOfInt = new int[2];
        localTextView.getLocationOnScreen(arrayOfInt);
      } while (!new Rect(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + localTextView.getWidth(), arrayOfInt[1] + localTextView.getHeight()).contains((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY()));
      while (localTextView != null)
      {
        this.xdj = localTextView;
        this.jry = paramMotionEvent.getRawX();
        this.iTi = paramMotionEvent.getRawY();
        this.xdh = System.currentTimeMillis();
        GMTrace.o(20400155131904L, 151993);
        return;
        localTextView = null;
      }
      if (this.xdj != null)
      {
        float f1 = paramMotionEvent.getRawX() - this.jry;
        float f2 = paramMotionEvent.getRawY() - this.iTi;
        w.v("MicroMsg.FTS.FTSMainUIEducationLayout", "action up deltaX %f, deltaY %f, time interval %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Long.valueOf(System.currentTimeMillis() - this.xdh) });
        if ((Math.abs(f1) <= this.inQ) && (Math.abs(f2) <= this.inQ) && (System.currentTimeMillis() - this.xdh < 200L) && (this.oDx != null)) {
          this.oDx.onClick(this.xdj);
        }
        this.xdj = null;
        GMTrace.o(20400155131904L, 151993);
        return;
        this.xdj = null;
      }
    }
  }
  
  public final void Z(JSONObject paramJSONObject)
  {
    GMTrace.i(16179544457216L, 120547);
    chE();
    try
    {
      if (!aa(paramJSONObject)) {
        chF();
      }
      GMTrace.o(16179544457216L, 120547);
      return;
    }
    catch (Exception paramJSONObject)
    {
      chF();
      GMTrace.o(16179544457216L, 120547);
    }
  }
  
  protected final void a(String paramString1, Object paramObject1, String paramString2, Object paramObject2, String paramString3, Object paramObject3, int paramInt)
  {
    GMTrace.i(16179947110400L, 120550);
    w.i("MicroMsg.FTS.FTSMainUIEducationLayout", "addCellLayout %s %s %s", new Object[] { paramString1, paramString2, paramString3 });
    if (!bg.nm(paramString1))
    {
      LinearLayout localLinearLayout = (LinearLayout)inflate(getContext(), R.i.cxR, null);
      TextView localTextView = (TextView)localLinearLayout.findViewById(R.h.cgS);
      localTextView.setText(paramString1);
      localTextView.setTag(paramObject1);
      localTextView.setVisibility(0);
      localTextView.setOnClickListener(this.oDx);
      localTextView.setClickable(this.xdi);
      this.xdf.put(Integer.valueOf(e.a((JSONObject)paramObject1, paramString1, getContext())), localTextView);
      bQ(paramObject1);
      if (!bg.nm(paramString2))
      {
        paramString1 = (TextView)localLinearLayout.findViewById(R.h.cgT);
        paramString1.setText(paramString2);
        paramString1.setTag(paramObject2);
        paramString1.setVisibility(0);
        paramString1.setOnClickListener(this.oDx);
        paramString1.setClickable(this.xdi);
        paramObject1 = localLinearLayout.findViewById(R.h.buA);
        ((View)paramObject1).getLayoutParams().height = paramInt;
        ((View)paramObject1).setVisibility(0);
        this.xdf.put(Integer.valueOf(e.a((JSONObject)paramObject2, paramString2, getContext())), paramString1);
        bQ(paramObject2);
        if (!bg.nm(paramString3))
        {
          paramString1 = (TextView)localLinearLayout.findViewById(R.h.cgU);
          paramString1.setText(paramString3);
          paramString1.setTag(paramObject3);
          paramString1.setVisibility(0);
          paramString1.setOnClickListener(this.oDx);
          paramString1.setClickable(this.xdi);
          paramObject1 = localLinearLayout.findViewById(R.h.buB);
          ((View)paramObject1).getLayoutParams().height = paramInt;
          ((View)paramObject1).setVisibility(0);
          this.xdf.put(Integer.valueOf(e.a((JSONObject)paramObject3, paramString3, getContext())), paramString1);
          bQ(paramObject3);
        }
      }
      this.xde.add(localLinearLayout);
      addView(localLinearLayout);
    }
    GMTrace.o(16179947110400L, 120550);
  }
  
  protected boolean aa(JSONObject paramJSONObject)
  {
    GMTrace.i(16179678674944L, 120548);
    if (paramJSONObject == null)
    {
      GMTrace.o(16179678674944L, 120548);
      return false;
    }
    if (this.hqH == null) {
      this.hqH = ((TextView)findViewById(R.h.bvC));
    }
    String str1 = paramJSONObject.optString("title");
    if (bg.nm(str1)) {
      this.hqH.setText(R.l.dWr);
    }
    JSONArray localJSONArray;
    for (;;)
    {
      localJSONArray = paramJSONObject.optJSONArray("items");
      if (localJSONArray != null) {
        break;
      }
      GMTrace.o(16179678674944L, 120548);
      return false;
      this.hqH.setText(str1);
    }
    String str2 = null;
    str1 = null;
    paramJSONObject = null;
    Object localObject = null;
    int i;
    int j;
    label148:
    JSONObject localJSONObject;
    if (v.eq(ab.getContext()).equalsIgnoreCase("en"))
    {
      i = a.V(getContext(), R.f.aPA);
      j = 0;
      if (j >= Math.min(localJSONArray.length(), 9)) {
        break label270;
      }
      localJSONObject = localJSONArray.optJSONObject(j);
      if (j % 3 != 0) {
        break label210;
      }
      str2 = localJSONObject.optString("hotword");
      paramJSONObject = localJSONObject;
    }
    for (;;)
    {
      j += 1;
      break label148;
      i = a.V(getContext(), R.f.aQF);
      break;
      label210:
      if (j % 3 == 1)
      {
        str1 = localJSONObject.optString("hotword");
        localObject = localJSONObject;
      }
      else
      {
        a(str2, paramJSONObject, str1, localObject, localJSONObject.optString("hotword"), localJSONObject, i);
        str2 = null;
        str1 = null;
        paramJSONObject = null;
        localObject = null;
      }
    }
    label270:
    if ((str2 != null) && (paramJSONObject != null)) {
      a(str2, paramJSONObject, str1, localObject, null, null, i);
    }
    GMTrace.o(16179678674944L, 120548);
    return true;
  }
  
  /* Error */
  public final void ar()
  {
    // Byte code:
    //   0: ldc2_w 510
    //   3: ldc_w 512
    //   6: invokestatic 42	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokespecial 365	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:chE	()V
    //   13: aload_0
    //   14: ldc_w 514
    //   17: invokestatic 520	com/tencent/mm/az/l:kM	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   20: invokevirtual 369	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:aa	(Lorg/json/JSONObject;)Z
    //   23: ifne +7 -> 30
    //   26: aload_0
    //   27: invokespecial 371	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:chF	()V
    //   30: aload_0
    //   31: getfield 73	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:xdk	Z
    //   34: ifeq +91 -> 125
    //   37: ldc_w 522
    //   40: invokestatic 520	com/tencent/mm/az/l:kM	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   43: ldc_w 474
    //   46: invokevirtual 478	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   49: iconst_0
    //   50: invokevirtual 506	org/json/JSONArray:optJSONObject	(I)Lorg/json/JSONObject;
    //   53: ldc_w 508
    //   56: invokevirtual 111	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   59: astore_2
    //   60: aload_2
    //   61: invokestatic 117	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   64: ifne +61 -> 125
    //   67: aload_0
    //   68: invokevirtual 57	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:getContext	()Landroid/content/Context;
    //   71: getstatic 525	com/tencent/mm/R$i:cxT	I
    //   74: aconst_null
    //   75: invokestatic 387	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   78: checkcast 4	android/widget/LinearLayout
    //   81: astore_3
    //   82: aload_3
    //   83: getstatic 528	com/tencent/mm/R$h:bGk	I
    //   86: invokevirtual 396	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   89: checkcast 231	android/widget/TextView
    //   92: aload_2
    //   93: invokevirtual 400	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   96: aload_3
    //   97: aload_0
    //   98: getfield 530	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:xdm	Landroid/view/View$OnClickListener;
    //   101: invokevirtual 531	android/widget/LinearLayout:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   104: aload_3
    //   105: aload_2
    //   106: invokevirtual 532	android/widget/LinearLayout:setTag	(Ljava/lang/Object;)V
    //   109: aload_0
    //   110: aload_3
    //   111: invokevirtual 456	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:addView	(Landroid/view/View;)V
    //   114: aload_0
    //   115: getfield 98	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:xde	Ljava/util/List;
    //   118: aload_3
    //   119: invokeinterface 453 2 0
    //   124: pop
    //   125: aload_0
    //   126: getfield 534	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:xdl	Z
    //   129: ifeq +443 -> 572
    //   132: ldc_w 536
    //   135: invokestatic 542	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   138: checkcast 536	com/tencent/mm/plugin/appbrand/k/f
    //   141: invokeinterface 546 1 0
    //   146: astore_3
    //   147: aload_3
    //   148: getfield 551	com/tencent/mm/plugin/appbrand/k/f$b:gpU	Ljava/util/List;
    //   151: ifnull +421 -> 572
    //   154: aload_3
    //   155: getfield 551	com/tencent/mm/plugin/appbrand/k/f$b:gpU	Ljava/util/List;
    //   158: invokeinterface 554 1 0
    //   163: ifle +409 -> 572
    //   166: aload_0
    //   167: invokevirtual 57	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:getContext	()Landroid/content/Context;
    //   170: getstatic 557	com/tencent/mm/R$i:cxU	I
    //   173: aconst_null
    //   174: invokestatic 387	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   177: checkcast 4	android/widget/LinearLayout
    //   180: astore_2
    //   181: aload_2
    //   182: getstatic 560	com/tencent/mm/R$h:chT	I
    //   185: invokevirtual 396	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   188: checkcast 231	android/widget/TextView
    //   191: aload_3
    //   192: getfield 563	com/tencent/mm/plugin/appbrand/k/f$b:eLQ	Ljava/lang/String;
    //   195: invokevirtual 400	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   198: iconst_4
    //   199: anewarray 565	android/widget/ImageView
    //   202: astore 4
    //   204: aload 4
    //   206: iconst_0
    //   207: aload_2
    //   208: getstatic 568	com/tencent/mm/R$h:bdY	I
    //   211: invokevirtual 396	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   214: checkcast 565	android/widget/ImageView
    //   217: aastore
    //   218: aload 4
    //   220: iconst_1
    //   221: aload_2
    //   222: getstatic 571	com/tencent/mm/R$h:bdZ	I
    //   225: invokevirtual 396	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   228: checkcast 565	android/widget/ImageView
    //   231: aastore
    //   232: aload 4
    //   234: iconst_2
    //   235: aload_2
    //   236: getstatic 574	com/tencent/mm/R$h:bea	I
    //   239: invokevirtual 396	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   242: checkcast 565	android/widget/ImageView
    //   245: aastore
    //   246: aload 4
    //   248: iconst_3
    //   249: aload_2
    //   250: getstatic 577	com/tencent/mm/R$h:beb	I
    //   253: invokevirtual 396	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   256: checkcast 565	android/widget/ImageView
    //   259: aastore
    //   260: aload_2
    //   261: getstatic 580	com/tencent/mm/R$h:bOr	I
    //   264: invokevirtual 396	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   267: checkcast 565	android/widget/ImageView
    //   270: astore 5
    //   272: iconst_0
    //   273: istore_1
    //   274: iload_1
    //   275: aload_3
    //   276: getfield 551	com/tencent/mm/plugin/appbrand/k/f$b:gpU	Ljava/util/List;
    //   279: invokeinterface 554 1 0
    //   284: if_icmpge +116 -> 400
    //   287: iload_1
    //   288: iconst_4
    //   289: if_icmpge +111 -> 400
    //   292: aload_3
    //   293: getfield 551	com/tencent/mm/plugin/appbrand/k/f$b:gpU	Ljava/util/List;
    //   296: iload_1
    //   297: invokeinterface 583 2 0
    //   302: checkcast 585	com/tencent/mm/plugin/appbrand/k/f$c
    //   305: astore 6
    //   307: new 587	com/tencent/mm/ao/a/a/c$a
    //   310: dup
    //   311: invokespecial 588	com/tencent/mm/ao/a/a/c$a:<init>	()V
    //   314: astore 7
    //   316: aload 7
    //   318: getstatic 593	com/tencent/mm/R$k:aVS	I
    //   321: putfield 596	com/tencent/mm/ao/a/a/c$a:gKR	I
    //   324: aload 7
    //   326: iconst_1
    //   327: putfield 599	com/tencent/mm/ao/a/a/c$a:gKZ	Z
    //   330: invokestatic 605	com/tencent/mm/ao/n:Jd	()Lcom/tencent/mm/ao/a/a;
    //   333: aload 6
    //   335: getfield 608	com/tencent/mm/plugin/appbrand/k/f$c:izx	Ljava/lang/String;
    //   338: aload 4
    //   340: iload_1
    //   341: aaload
    //   342: aload 7
    //   344: invokevirtual 612	com/tencent/mm/ao/a/a/c$a:Jn	()Lcom/tencent/mm/ao/a/a/c;
    //   347: invokevirtual 617	com/tencent/mm/ao/a/a:a	(Ljava/lang/String;Landroid/widget/ImageView;Lcom/tencent/mm/ao/a/a/c;)V
    //   350: aload 4
    //   352: iload_1
    //   353: aaload
    //   354: iconst_0
    //   355: invokevirtual 618	android/widget/ImageView:setVisibility	(I)V
    //   358: aload 4
    //   360: iload_1
    //   361: aaload
    //   362: aload 6
    //   364: invokevirtual 619	android/widget/ImageView:setTag	(Ljava/lang/Object;)V
    //   367: aload_0
    //   368: getfield 621	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:xdn	Landroid/view/View$OnClickListener;
    //   371: ifnull +14 -> 385
    //   374: aload 4
    //   376: iload_1
    //   377: aaload
    //   378: aload_0
    //   379: getfield 621	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:xdn	Landroid/view/View$OnClickListener;
    //   382: invokevirtual 622	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   385: iload_1
    //   386: iconst_1
    //   387: iadd
    //   388: istore_1
    //   389: goto -115 -> 274
    //   392: astore_2
    //   393: aload_0
    //   394: invokespecial 371	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:chF	()V
    //   397: goto -367 -> 30
    //   400: aload_3
    //   401: getfield 551	com/tencent/mm/plugin/appbrand/k/f$b:gpU	Ljava/util/List;
    //   404: invokeinterface 554 1 0
    //   409: ifle +26 -> 435
    //   412: aload 5
    //   414: iconst_0
    //   415: invokevirtual 618	android/widget/ImageView:setVisibility	(I)V
    //   418: aload 5
    //   420: ldc_w 624
    //   423: invokevirtual 619	android/widget/ImageView:setTag	(Ljava/lang/Object;)V
    //   426: aload 5
    //   428: aload_0
    //   429: getfield 621	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:xdn	Landroid/view/View$OnClickListener;
    //   432: invokevirtual 622	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   435: aload_0
    //   436: aload_2
    //   437: invokevirtual 456	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:addView	(Landroid/view/View;)V
    //   440: aload_0
    //   441: getfield 98	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:xde	Ljava/util/List;
    //   444: aload_2
    //   445: invokeinterface 453 2 0
    //   450: pop
    //   451: aload_3
    //   452: getfield 551	com/tencent/mm/plugin/appbrand/k/f$b:gpU	Ljava/util/List;
    //   455: invokeinterface 145 1 0
    //   460: astore 4
    //   462: ldc 51
    //   464: astore_2
    //   465: aload 4
    //   467: invokeinterface 151 1 0
    //   472: ifeq +47 -> 519
    //   475: aload 4
    //   477: invokeinterface 155 1 0
    //   482: checkcast 585	com/tencent/mm/plugin/appbrand/k/f$c
    //   485: astore 5
    //   487: new 124	java/lang/StringBuilder
    //   490: dup
    //   491: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   494: aload_2
    //   495: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: aload 5
    //   500: getfield 627	com/tencent/mm/plugin/appbrand/k/f$c:username	Ljava/lang/String;
    //   503: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: ldc_w 629
    //   509: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   515: astore_2
    //   516: goto -51 -> 465
    //   519: getstatic 635	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   522: sipush 14630
    //   525: iconst_5
    //   526: anewarray 272	java/lang/Object
    //   529: dup
    //   530: iconst_0
    //   531: getstatic 640	com/tencent/mm/az/h:gRD	Ljava/lang/String;
    //   534: aastore
    //   535: dup
    //   536: iconst_1
    //   537: aload_3
    //   538: getfield 563	com/tencent/mm/plugin/appbrand/k/f$b:eLQ	Ljava/lang/String;
    //   541: aastore
    //   542: dup
    //   543: iconst_2
    //   544: aload_2
    //   545: aastore
    //   546: dup
    //   547: iconst_3
    //   548: aload_3
    //   549: getfield 643	com/tencent/mm/plugin/appbrand/k/f$b:izw	I
    //   552: invokestatic 252	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   555: aastore
    //   556: dup
    //   557: iconst_4
    //   558: invokestatic 328	java/lang/System:currentTimeMillis	()J
    //   561: ldc2_w 644
    //   564: ldiv
    //   565: invokestatic 342	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   568: aastore
    //   569: invokevirtual 648	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   572: ldc2_w 510
    //   575: ldc_w 512
    //   578: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   581: return
    //   582: astore_2
    //   583: goto -458 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	586	0	this	FTSMainUIEducationLayout
    //   273	116	1	i	int
    //   59	202	2	localObject1	Object
    //   392	53	2	localException1	Exception
    //   464	81	2	str	String
    //   582	1	2	localException2	Exception
    //   81	468	3	localObject2	Object
    //   202	274	4	localObject3	Object
    //   270	229	5	localObject4	Object
    //   305	58	6	localc	com.tencent.mm.plugin.appbrand.k.f.c
    //   314	29	7	locala	com.tencent.mm.ao.a.a.c.a
    // Exception table:
    //   from	to	target	type
    //   13	30	392	java/lang/Exception
    //   30	125	582	java/lang/Exception
  }
  
  public final void chD()
  {
    GMTrace.i(19223468310528L, 143226);
    this.xdk = false;
    GMTrace.o(19223468310528L, 143226);
  }
  
  protected void chG()
  {
    GMTrace.i(16796006481920L, 125140);
    GMTrace.o(16796006481920L, 125140);
  }
  
  public final void i(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(16796140699648L, 125141);
    this.oDx = paramOnClickListener;
    GMTrace.o(16796140699648L, 125141);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\fts\widget\FTSMainUIEducationLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */