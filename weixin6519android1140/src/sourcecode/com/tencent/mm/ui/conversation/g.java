package com.tencent.mm.ui.conversation;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
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
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.aa;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.g;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.a;
import com.tencent.mm.pluginsdk.ui.j.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.f.b;
import com.tencent.mm.x.j;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class g
  extends com.tencent.mm.ui.f<String, ae>
  implements m.b
{
  protected List<String> iVA;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.d jpT;
  boolean mAG;
  private boolean mDI;
  boolean pSx;
  public boolean wDw;
  com.tencent.mm.sdk.b.c wWC;
  public String wWE;
  private final int wWG;
  private final int wWH;
  private boolean wWv;
  com.tencent.mm.pluginsdk.ui.d wWx;
  private boolean wWz;
  HashMap<String, Integer> wXA;
  private HashMap<String, Integer> wXB;
  boolean wXC;
  HashSet<String> wXD;
  boolean wXE;
  private boolean wXF;
  public String wXG;
  final e wXH;
  private float wXI;
  private a wXJ;
  private long wXK;
  private boolean wXv;
  private rb wXw;
  b wXx;
  private HashSet<String> wXy;
  private boolean wXz;
  private float woL;
  private float woM;
  private float woN;
  private ColorStateList[] woO;
  HashMap<String, d> woP;
  
  public g(Context paramContext, com.tencent.mm.ui.f.a parama)
  {
    super(paramContext, (byte)0);
    GMTrace.i(3397587566592L, 25314);
    this.iVA = null;
    this.woO = new ColorStateList[5];
    this.wWv = true;
    this.wXv = false;
    this.jpT = MMSlideDelView.cah();
    this.wXw = null;
    this.mDI = false;
    this.woL = -1.0F;
    this.woM = -1.0F;
    this.woN = -1.0F;
    this.wWz = false;
    this.wWC = null;
    this.wXx = null;
    this.wDw = false;
    this.wXz = false;
    this.wXA = new HashMap();
    this.wXB = new HashMap();
    this.wXC = false;
    this.wXE = false;
    this.wXF = false;
    this.wWE = "";
    this.wXG = "";
    this.wXH = new e();
    this.pSx = false;
    this.wXI = -1.0F;
    this.wXK = 0L;
    this.mAG = false;
    this.TAG = "MicroMsg.ConversationWithCacheAdapter";
    super.a(parama);
    this.woO[0] = com.tencent.mm.br.a.U(paramContext, R.e.aOa);
    this.woO[1] = com.tencent.mm.br.a.U(paramContext, R.e.aOu);
    this.woO[3] = com.tencent.mm.br.a.U(paramContext, R.e.aOE);
    this.woO[2] = com.tencent.mm.br.a.U(paramContext, R.e.aOs);
    this.woO[2] = com.tencent.mm.br.a.U(paramContext, R.e.aOs);
    this.woO[4] = com.tencent.mm.br.a.U(paramContext, R.e.aOk);
    if (com.tencent.mm.br.a.ed(paramContext)) {
      this.wWH = paramContext.getResources().getDimensionPixelSize(R.f.aPJ);
    }
    for (this.wWG = paramContext.getResources().getDimensionPixelSize(R.f.aPK);; this.wWG = paramContext.getResources().getDimensionPixelSize(R.f.aPL))
    {
      this.woP = new HashMap();
      this.wXy = new HashSet();
      this.wXD = new HashSet();
      this.woL = paramContext.getResources().getDimension(R.f.aQF);
      this.woM = paramContext.getResources().getDimension(R.f.aQo);
      this.woN = paramContext.getResources().getDimension(R.f.aQR);
      this.iVA = new ArrayList();
      this.iVA.add("qmessage");
      GMTrace.o(3397587566592L, 25314);
      return;
      this.wWH = paramContext.getResources().getDimensionPixelSize(R.f.aPI);
    }
  }
  
  private static String VP(String paramString)
  {
    GMTrace.i(3399869267968L, 25331);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(paramString);
      GMTrace.o(3399869267968L, 25331);
      return paramString;
    }
    GMTrace.o(3399869267968L, 25331);
    return null;
  }
  
  static int a(ae paramae, d paramd)
  {
    GMTrace.i(3399332397056L, 25327);
    if ((paramae == null) || (paramae.field_unReadCount <= 0))
    {
      if ((paramae != null) && ((paramae.eH(8388608)) || (paramae.eH(2097152))) && (paramae != null) && (paramae.field_unReadMuteCount > 0))
      {
        GMTrace.o(3399332397056L, 25327);
        return 1;
      }
      GMTrace.o(3399332397056L, 25327);
      return 0;
    }
    if (com.tencent.mm.y.s.gc(paramae.field_username))
    {
      GMTrace.o(3399332397056L, 25327);
      return 1;
    }
    if (com.tencent.mm.y.s.gh(paramae.field_username))
    {
      at.AR();
      if (!com.tencent.mm.y.c.xh().getBoolean(w.a.vve, true))
      {
        GMTrace.o(3399332397056L, 25327);
        return 1;
      }
    }
    if (com.tencent.mm.y.s.gl(paramae.field_username))
    {
      at.AR();
      if (!com.tencent.mm.y.c.xh().getBoolean(w.a.vvf, true))
      {
        GMTrace.o(3399332397056L, 25327);
        return 1;
      }
    }
    if ((paramd.wWV) && (paramd.wWZ))
    {
      GMTrace.o(3399332397056L, 25327);
      return 1;
    }
    if ((paramd.sdk) && (paramd.wWY))
    {
      GMTrace.o(3399332397056L, 25327);
      return 1;
    }
    GMTrace.o(3399332397056L, 25327);
    return 2;
  }
  
  private SparseArray<String> a(f.b<String, ae> paramb, SparseArray<String> paramSparseArray, HashMap<String, ae> paramHashMap)
  {
    GMTrace.i(3400540356608L, 25336);
    String str = (String)paramb.yA;
    int k = paramSparseArray.size();
    ae localae = (ae)paramb.vHb;
    int j = paramSparseArray.size();
    int i = 0;
    label42:
    if (i < j) {
      if (!((String)paramSparseArray.get(i)).equals(str)) {}
    }
    for (;;)
    {
      w.d("MicroMsg.ConversationWithCacheAdapter", "resortPosition username %s,  size %d, position %d", new Object[] { str, Integer.valueOf(k), Integer.valueOf(i) });
      switch (paramb.vHa)
      {
      case 3: 
      case 4: 
      default: 
        if (i >= 0) {
          break label423;
        }
        w.e("MicroMsg.ConversationWithCacheAdapter", "CursorDataAdapter.CHANGE_TYPE_UPDATE  position < 0");
        GMTrace.o(3400540356608L, 25336);
        return paramSparseArray;
        i += 1;
        break label42;
        i = -1;
      }
    }
    j = i;
    if (i < 0)
    {
      GMTrace.o(3400540356608L, 25336);
      return paramSparseArray;
    }
    while (j < k - 1)
    {
      paramSparseArray.put(j, paramSparseArray.get(j + 1));
      j += 1;
    }
    paramSparseArray.remove(k - 1);
    for (;;)
    {
      GMTrace.o(3400540356608L, 25336);
      return paramSparseArray;
      if (localae == null)
      {
        w.e("MicroMsg.ConversationWithCacheAdapter", "CursorDataAdapter.CHANGE_TYPE_INSERT  cov == null");
        if (i >= 0)
        {
          w.e("MicroMsg.ConversationWithCacheAdapter", "CursorDataAdapter.CHANGE_TYPE_INSERT  cov == null delete it username %s", new Object[] { str });
          while (i < k - 1)
          {
            paramSparseArray.put(i, paramSparseArray.get(i + 1));
            i += 1;
          }
          paramSparseArray.remove(k - 1);
        }
        GMTrace.o(3400540356608L, 25336);
        return paramSparseArray;
      }
      if (i >= 0) {
        break;
      }
      i = 0;
      while ((i < k) && (c((String)paramSparseArray.get(i), paramHashMap).field_flag > localae.field_flag)) {
        i += 1;
      }
      j = k;
      while (j > i)
      {
        paramSparseArray.put(j, paramSparseArray.get(j - 1));
        j -= 1;
      }
      paramSparseArray.put(i, str);
    }
    label423:
    paramb = c(str, paramHashMap);
    if (localae == null)
    {
      w.e("MicroMsg.ConversationWithCacheAdapter", "CursorDataAdapter.CHANGE_TYPE_UPDATE  cov == null delete it username %s", new Object[] { str });
      while (i < k - 1)
      {
        paramSparseArray.put(i, paramSparseArray.get(i + 1));
        i += 1;
      }
      paramSparseArray.remove(k - 1);
      GMTrace.o(3400540356608L, 25336);
      return paramSparseArray;
    }
    long l1 = paramb.field_flag;
    long l2 = localae.field_flag;
    if (l1 == l2)
    {
      GMTrace.o(3400540356608L, 25336);
      return paramSparseArray;
    }
    int n;
    int m;
    if (l1 < l2)
    {
      n = i - 1;
      j = 0;
      m = 1;
      label556:
      k = j;
      label560:
      if (k > n) {
        break label786;
      }
      if (c((String)paramSparseArray.get(k), paramHashMap).field_flag > localae.field_flag) {
        break label687;
      }
    }
    label687:
    label786:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.ConversationWithCacheAdapter", "resortPosition: begin-%d end-%d tempUpdate-%d found-%b position-%d username-%s", new Object[] { Integer.valueOf(j), Integer.valueOf(n), Integer.valueOf(-1), Boolean.valueOf(bool), Integer.valueOf(i), str });
      if (!bool)
      {
        GMTrace.o(3400540356608L, 25336);
        return paramSparseArray;
        n = k - 1;
        j = i + 1;
        m = 0;
        break label556;
        k += 1;
        break label560;
      }
      if (m != 0) {
        while (i > k)
        {
          paramSparseArray.put(i, paramSparseArray.get(i - 1));
          i -= 1;
        }
      }
      k -= 1;
      for (;;)
      {
        j = k;
        if (i >= k) {
          break;
        }
        paramSparseArray.put(i, paramSparseArray.get(i + 1));
        i += 1;
      }
      j = k;
      paramSparseArray.put(j, str);
      break;
    }
  }
  
  private void a(d paramd)
  {
    GMTrace.i(3399198179328L, 25326);
    if ((paramd.sdk) && (paramd.fMz == null))
    {
      paramd.nickName = this.context.getString(R.l.dhh);
      GMTrace.o(3399198179328L, 25326);
      return;
    }
    paramd.nickName = com.tencent.mm.pluginsdk.ui.d.h.c(this.context, paramd.fMz, com.tencent.mm.br.a.V(this.context, R.f.aQF));
    GMTrace.o(3399198179328L, 25326);
  }
  
  private CharSequence b(ae paramae, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(3399735050240L, 25330);
    if ((!com.tencent.mm.platformtools.t.nm(paramae.field_editingMsg)) && ((paramae.field_atCount <= 0) || ((paramae.field_unReadCount <= 0) && (paramae.field_unReadMuteCount <= 0))))
    {
      localObject1 = new SpannableStringBuilder(this.context.getString(R.l.dHL));
      ((SpannableStringBuilder)localObject1).setSpan(new ForegroundColorSpan(-5569532), 0, ((SpannableStringBuilder)localObject1).length(), 33);
      ((SpannableStringBuilder)localObject1).append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, paramae.field_editingMsg, paramInt));
      GMTrace.o(3399735050240L, 25330);
      return (CharSequence)localObject1;
    }
    if (tE(paramae.field_msgType) == 10000)
    {
      boolean bool2 = com.tencent.mm.y.s.gc(paramae.field_username);
      boolean bool1 = bool2;
      if (!bool2) {
        bool1 = paramae.eH(2097152);
      }
      bool2 = bool1;
      if (!bool1) {
        bool2 = paramae.eH(8388608);
      }
      bool1 = bool2;
      if (!bool2) {
        bool1 = paramae.eH(16777216);
      }
      bool2 = bool1;
      if (!bool1) {
        bool2 = com.tencent.mm.y.s.gl(paramae.field_username);
      }
      if (!bool2)
      {
        paramae = new SpannableString(com.tencent.mm.pluginsdk.ui.d.h.g(this.context, paramae.field_content, paramInt));
        GMTrace.o(3399735050240L, 25330);
        return paramae;
      }
    }
    Object localObject2;
    if (tE(paramae.field_msgType) == 49)
    {
      localObject1 = r.fs(paramae.field_digestUser);
      localObject2 = com.tencent.mm.x.f.a.eS(paramae.field_content);
      if ((localObject2 != null) && (((com.tencent.mm.x.f.a)localObject2).type == 40) && (j.eW(paramae.field_content).glu == 19))
      {
        if (com.tencent.mm.platformtools.t.nm((String)localObject1)) {}
        for (localObject1 = this.context.getString(R.l.cUk);; localObject1 = (String)localObject1 + ": " + this.context.getString(R.l.cUk))
        {
          paramae.cO((String)localObject1);
          GMTrace.o(3399735050240L, 25330);
          return (CharSequence)localObject1;
        }
      }
    }
    Object localObject1 = paramae.field_digest;
    if ((localObject1 != null) && (((String)localObject1).startsWith("<img src=\"original_label.png\"/>  ")))
    {
      paramae = new SpannableString(com.tencent.mm.pluginsdk.ui.d.h.d(this.context, (CharSequence)localObject1, paramInt));
      GMTrace.o(3399735050240L, 25330);
      return paramae;
    }
    localObject1 = paramae.field_username;
    int i;
    if (((String)localObject1).equals("qqmail"))
    {
      at.AR();
      if (com.tencent.mm.platformtools.t.e((Integer)com.tencent.mm.y.c.xh().get(17, null)) == 1) {}
      for (i = 1; i == 0; i = 0)
      {
        paramae = this.context.getString(R.l.dZT);
        GMTrace.o(3399735050240L, 25330);
        return paramae;
      }
    }
    if (((String)localObject1).equals("tmessage"))
    {
      at.AR();
      localObject1 = com.tencent.mm.y.c.yS().CB("@t.qq.com");
      if ((localObject1 != null) && (((ay)localObject1).isEnable())) {}
      for (i = 1; i == 0; i = 0)
      {
        paramae = this.context.getString(R.l.dZT);
        GMTrace.o(3399735050240L, 25330);
        return paramae;
      }
    }
    if ((paramae.field_msgType != null) && (paramae.field_msgType.equals("64")))
    {
      paramae = paramae.field_content;
      GMTrace.o(3399735050240L, 25330);
      return paramae;
    }
    if ((paramae.field_msgType != null) && ((paramae.field_msgType.equals("47")) || (paramae.field_msgType.equals("1048625"))))
    {
      localObject1 = VP(paramae.field_digest);
      localObject2 = "";
      if (!com.tencent.mm.platformtools.t.nm((String)localObject1))
      {
        paramae = "[" + (String)localObject1 + "]";
        GMTrace.o(3399735050240L, 25330);
        return paramae;
      }
      localObject1 = localObject2;
      if (paramae.field_digest != null)
      {
        localObject1 = localObject2;
        if (paramae.field_digest.contains(":"))
        {
          localObject2 = paramae.field_digest.substring(0, paramae.field_digest.indexOf(":"));
          String str2 = VP(paramae.field_digest.substring(paramae.field_digest.indexOf(":") + 1).replace(" ", ""));
          localObject1 = localObject2;
          if (!com.tencent.mm.platformtools.t.nm(str2))
          {
            paramae = "[" + str2 + "]";
            if (com.tencent.mm.platformtools.t.nm((String)localObject2))
            {
              paramae = com.tencent.mm.pluginsdk.ui.d.h.c(this.context, (CharSequence)localObject2, paramInt);
              GMTrace.o(3399735050240L, 25330);
              return paramae;
            }
            localObject1 = new SpannableStringBuilder();
            ((SpannableStringBuilder)localObject1).append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, (CharSequence)localObject2, paramInt));
            ((SpannableStringBuilder)localObject1).append(": ");
            ((SpannableStringBuilder)localObject1).append(paramae);
            GMTrace.o(3399735050240L, 25330);
            return (CharSequence)localObject1;
          }
        }
      }
      localObject2 = this.context.getString(R.l.cSD);
      if (com.tencent.mm.platformtools.t.nm((String)localObject1))
      {
        localObject1 = localObject2;
        paramae.cO((String)localObject1);
      }
    }
    else
    {
      if (com.tencent.mm.platformtools.t.nm(paramae.field_digest)) {
        break label1183;
      }
      if (com.tencent.mm.platformtools.t.nm(paramae.field_digestUser)) {
        break label1172;
      }
      if ((paramae.field_isSend != 0) || (!com.tencent.mm.y.s.eb(paramae.field_username))) {
        break label1160;
      }
      localObject1 = r.F(paramae.field_digestUser, paramae.field_username);
    }
    label1160:
    label1172:
    label1183:
    String str1;
    for (;;)
    {
      try
      {
        localObject1 = String.format(paramae.field_digest, new Object[] { localObject1 });
        localObject1 = ((String)localObject1).replace('\n', ' ');
        if (paramae.field_UnReadInvite <= 0) {
          break label1228;
        }
        if (paramae.field_UnReadInvite >= 4096) {
          break label1214;
        }
        paramae = this.context.getString(R.l.dHI, new Object[] { Integer.valueOf(paramae.field_UnReadInvite) });
        paramae = new SpannableStringBuilder(paramae);
        paramae.setSpan(new ForegroundColorSpan(-5569532), 0, paramae.length(), 33);
        paramae.append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, (CharSequence)localObject1, paramInt));
        GMTrace.o(3399735050240L, 25330);
        return paramae;
      }
      catch (Exception localException) {}
      localObject1 = (String)localObject1 + ": " + (String)localObject2;
      break;
      localObject1 = r.fs(paramae.field_digestUser);
      continue;
      localObject1 = paramae.field_digest;
      continue;
      str1 = com.tencent.mm.booter.notification.a.h.a(paramae.field_isSend, paramae.field_username, paramae.field_content, tE(paramae.field_msgType), this.context);
      continue;
      label1214:
      paramae = this.context.getString(R.l.dHG);
    }
    label1228:
    if ((paramae.field_atCount > 0) && ((paramae.field_unReadCount > 0) || (paramae.field_unReadMuteCount > 0)))
    {
      localObject2 = this.context;
      if (paramae.field_atCount < 4096) {}
      for (i = R.l.dHH;; i = R.l.dHJ)
      {
        paramae = new SpannableStringBuilder(((Context)localObject2).getString(i));
        paramae.setSpan(new ForegroundColorSpan(-5569532), 0, paramae.length(), 33);
        paramae.append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, str1, paramInt));
        GMTrace.o(3399735050240L, 25330);
        return paramae;
      }
    }
    if ((paramae.eH(16777216)) && ((paramae.field_unReadCount > 0) || (paramae.field_unReadMuteCount > 0)))
    {
      paramae = this.context.getString(R.l.cPR);
      str1 = str1.replace(paramae, "");
      paramae = new SpannableStringBuilder(paramae);
      paramae.setSpan(new ForegroundColorSpan(-5569532), 0, paramae.length(), 33);
      paramae.append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, str1, paramInt));
      GMTrace.o(3399735050240L, 25330);
      return paramae;
    }
    if ((paramBoolean) && ((paramae.field_unReadCount > 1) || (paramae.field_unReadMuteCount > 0))) {}
    for (paramae = this.context.getString(R.l.dHK, new Object[] { Integer.valueOf(paramae.field_unReadCount), str1 });; paramae = str1)
    {
      paramae = com.tencent.mm.pluginsdk.ui.d.h.c(this.context, paramae, paramInt);
      GMTrace.o(3399735050240L, 25330);
      return paramae;
    }
  }
  
  private ae c(String paramString, HashMap<String, ae> paramHashMap)
  {
    GMTrace.i(3400406138880L, 25335);
    if ((paramHashMap != null) && (paramHashMap.containsKey(paramString)))
    {
      paramString = (ae)paramHashMap.get(paramString);
      GMTrace.o(3400406138880L, 25335);
      return paramString;
    }
    paramString = (ae)bM(paramString);
    GMTrace.o(3400406138880L, 25335);
    return paramString;
  }
  
  private void cgU()
  {
    GMTrace.i(3398527090688L, 25321);
    if (this.woP == null)
    {
      GMTrace.o(3398527090688L, 25321);
      return;
    }
    Iterator localIterator = this.woP.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((d)((Map.Entry)localIterator.next()).getValue()).wWP = null;
    }
    GMTrace.o(3398527090688L, 25321);
  }
  
  private void cgZ()
  {
    GMTrace.i(3400808792064L, 25338);
    if ((this.woP == null) || (this.wXy == null) || (this.wXy.isEmpty()))
    {
      GMTrace.o(3400808792064L, 25338);
      return;
    }
    w.d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents contactEvents size %d", new Object[] { Integer.valueOf(this.wXy.size()) });
    Iterator localIterator = this.wXy.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      int j = i;
      d locald;
      x localx;
      boolean bool2;
      if (str1 != null)
      {
        j = i;
        if (!str1.equals(""))
        {
          j = i;
          if (this.woP.containsKey(str1))
          {
            locald = (d)this.woP.get(str1);
            j = i;
            if (locald != null)
            {
              this.wXH.db(str1);
              bool1 = com.tencent.mm.y.s.eb(str1);
              localx = this.wXH.chb();
              if (localx == null) {
                continue;
              }
              String str2 = r.a(localx, str1, bool1);
              w.d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents newdisplayname %s old dispalyname %s", new Object[] { str2, locald.fMz });
              j = i;
              if (str2 != null)
              {
                j = i;
                if (!str2.equals(locald.fMz))
                {
                  locald.fMz = str2;
                  a(locald);
                  j = 1;
                }
              }
              bool2 = localx.vc();
              if (localx.fji != 0) {
                break label339;
              }
            }
          }
        }
      }
      label339:
      for (boolean bool1 = true;; bool1 = false)
      {
        if ((locald.wWV != bool2) || (bool1 != locald.wWY))
        {
          locald.wWV = bool2;
          locald.wWY = bool1;
          locald.wWZ = localx.vd();
          j = 1;
          w.d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents in cache username %s mute change", new Object[] { str1 });
        }
        i = j;
        break;
      }
    }
    if (i != 0) {
      notifyDataSetChanged();
    }
    this.wXy.clear();
    GMTrace.o(3400808792064L, 25338);
  }
  
  private CharSequence i(ae paramae)
  {
    GMTrace.i(3398124437504L, 25318);
    if (paramae.field_status == 1)
    {
      paramae = this.context.getString(R.l.dIe);
      GMTrace.o(3398124437504L, 25318);
      return paramae;
    }
    if (paramae.field_conversationTime == Long.MAX_VALUE)
    {
      GMTrace.o(3398124437504L, 25318);
      return "";
    }
    paramae = com.tencent.mm.pluginsdk.i.n.c(this.context, paramae.field_conversationTime, true);
    GMTrace.o(3398124437504L, 25318);
    return paramae;
  }
  
  private static int tE(String paramString)
  {
    int j = 1;
    GMTrace.i(3399466614784L, 25328);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(3399466614784L, 25328);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        i = j;
      }
    }
  }
  
  public final void DG(int paramInt)
  {
    GMTrace.i(3401211445248L, 25341);
    if ((paramInt < 0) || (paramInt >= getCount()))
    {
      GMTrace.o(3401211445248L, 25341);
      return;
    }
    ae localae = (ae)AH(paramInt);
    if (localae == null)
    {
      GMTrace.o(3401211445248L, 25341);
      return;
    }
    a.b.bKI().bw(localae.field_username);
    GMTrace.o(3401211445248L, 25341);
  }
  
  public final boolean WE(String paramString)
  {
    GMTrace.i(3401077227520L, 25340);
    if ((this.woP == null) || (!this.woP.containsKey(paramString)))
    {
      GMTrace.o(3401077227520L, 25340);
      return true;
    }
    GMTrace.o(3401077227520L, 25340);
    return false;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    int j = 0;
    GMTrace.i(3400674574336L, 25337);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.d("MicroMsg.ConversationWithCacheAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(3400674574336L, 25337);
      return;
    }
    String str = (String)paramObject;
    if ((paramm instanceof as))
    {
      w.i("MicroMsg.ConversationWithCacheAdapter", "unreadcheck onConversationStorageNotifyChange event type %d, username %s", new Object[] { Integer.valueOf(paramInt), str });
      int i = j;
      if (str.contains("@"))
      {
        i = j;
        if (!str.endsWith("@chatroom")) {
          if (!str.endsWith("@micromsg.qq.com")) {
            break label157;
          }
        }
      }
      label157:
      for (i = j; i != 0; i = 1)
      {
        GMTrace.o(3400674574336L, 25337);
        return;
      }
      if (this.woP != null) {
        if (paramObject.equals(""))
        {
          if (paramInt == 5)
          {
            this.wXE = true;
            super.n(null, 1);
            GMTrace.o(3400674574336L, 25337);
          }
        }
        else {
          this.wXD.add(str);
        }
      }
      i = paramInt;
      if (paramInt == 3) {
        i = 2;
      }
      super.n(str, i);
      GMTrace.o(3400674574336L, 25337);
      return;
    }
    if ((paramm instanceof ar))
    {
      w.d("MicroMsg.ConversationWithCacheAdapter", "unreadcheck onContactStorageNotifyChange event type %d, username %s, isIniting %b", new Object[] { Integer.valueOf(paramInt), paramObject, Boolean.valueOf(this.mAG) });
      if (this.mAG)
      {
        GMTrace.o(3400674574336L, 25337);
        return;
      }
      this.wXC = true;
      if ((paramInt == 5) || (paramInt == 2))
      {
        GMTrace.o(3400674574336L, 25337);
        return;
      }
      if ((this.woP == null) || (!this.woP.containsKey(str)))
      {
        GMTrace.o(3400674574336L, 25337);
        return;
      }
      if (this.wXy != null) {
        this.wXy.add(str);
      }
    }
    GMTrace.o(3400674574336L, 25337);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(3397990219776L, 25317);
    this.jpR = paramc;
    GMTrace.o(3397990219776L, 25317);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(3397721784320L, 25315);
    this.jpQ = paramf;
    GMTrace.o(3397721784320L, 25315);
  }
  
  public final SparseArray<String>[] a(HashSet<f.b<String, ae>> paramHashSet, SparseArray<String>[] paramArrayOfSparseArray)
  {
    GMTrace.i(3400271921152L, 25334);
    if ((paramArrayOfSparseArray == null) || (paramArrayOfSparseArray.length <= 0))
    {
      GMTrace.o(3400271921152L, 25334);
      return paramArrayOfSparseArray;
    }
    w.d("MicroMsg.ConversationWithCacheAdapter", "refreshPosistion events size %d oldPosistion size %d", new Object[] { Integer.valueOf(paramHashSet.size()), Integer.valueOf(paramArrayOfSparseArray[0].size()) });
    Object localObject1 = new ArrayList();
    Object localObject2 = paramHashSet.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (f.b)((Iterator)localObject2).next();
      if ((localObject3 != null) && (((f.b)localObject3).vHa != 5) && (!((ArrayList)localObject1).contains(((f.b)localObject3).yA)))
      {
        w.d("MicroMsg.ConversationWithCacheAdapter", "searchArray.add(event.object) " + (String)((f.b)localObject3).yA);
        ((ArrayList)localObject1).add(((f.b)localObject3).yA);
      }
    }
    localObject2 = new HashMap();
    at.AR();
    Object localObject3 = com.tencent.mm.y.c.yP().a((ArrayList)localObject1, com.tencent.mm.y.s.gmw, this.iVA, com.tencent.mm.m.a.fTs);
    Object localObject4;
    while (((Cursor)localObject3).moveToNext())
    {
      localObject4 = new ae();
      ((ae)localObject4).b((Cursor)localObject3);
      ((HashMap)localObject2).put(((aj)localObject4).field_username, localObject4);
    }
    ((Cursor)localObject3).close();
    localObject3 = paramHashSet.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (f.b)((Iterator)localObject3).next();
      if (localObject4 != null)
      {
        if (((f.b)localObject4).vHa != 5)
        {
          StringBuilder localStringBuilder = new StringBuilder("evnet name,").append((String)((f.b)localObject4).yA).append("  event.newObj   ==");
          if (((HashMap)localObject2).get(((f.b)localObject4).yA) == null) {}
          for (boolean bool = true;; bool = false)
          {
            w.d("MicroMsg.ConversationWithCacheAdapter", bool);
            ((f.b)localObject4).vHb = ((HashMap)localObject2).get(((f.b)localObject4).yA);
            break;
          }
        }
        ((f.b)localObject4).vHb = null;
      }
    }
    ((ArrayList)localObject1).clear();
    ((HashMap)localObject2).clear();
    localObject1 = new HashMap();
    paramHashSet = paramHashSet.iterator();
    while (paramHashSet.hasNext())
    {
      localObject2 = (f.b)paramHashSet.next();
      if (localObject2 != null)
      {
        a((f.b)localObject2, paramArrayOfSparseArray[0], (HashMap)localObject1);
        if (((f.b)localObject2).vHa != 5) {
          ((HashMap)localObject1).put(((f.b)localObject2).yA, ((f.b)localObject2).vHb);
        }
      }
    }
    GMTrace.o(3400271921152L, 25334);
    return paramArrayOfSparseArray;
  }
  
  public final ArrayList<ae> ah(ArrayList<String> paramArrayList)
  {
    GMTrace.i(3400137703424L, 25333);
    w.d("MicroMsg.ConversationWithCacheAdapter", "rebulidAllChangeData obj.size() %d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    ArrayList localArrayList = new ArrayList(paramArrayList.size());
    at.AR();
    paramArrayList = com.tencent.mm.y.c.yP().a(paramArrayList, com.tencent.mm.y.s.gmw, this.iVA, com.tencent.mm.m.a.fTs);
    while (paramArrayList.moveToNext())
    {
      ae localae = new ae();
      localae.b(paramArrayList);
      localArrayList.add(localae);
    }
    paramArrayList.close();
    GMTrace.o(3400137703424L, 25333);
    return localArrayList;
  }
  
  public final boolean bVh()
  {
    GMTrace.i(3400943009792L, 25339);
    boolean bool = super.bVh();
    GMTrace.o(3400943009792L, 25339);
    return bool;
  }
  
  public final com.tencent.mm.bu.a.d bWu()
  {
    GMTrace.i(16852780580864L, 125563);
    w.d("MicroMsg.ConversationWithCacheAdapter", "createCursor");
    at.AR();
    com.tencent.mm.bu.a.d locald = (com.tencent.mm.bu.a.d)com.tencent.mm.y.c.yP().a(com.tencent.mm.y.s.gmw, this.iVA, com.tencent.mm.m.a.fTs, true);
    GMTrace.o(16852780580864L, 125563);
    return locald;
  }
  
  public final void cgY()
  {
    GMTrace.i(3398795526144L, 25323);
    super.n(null, 1);
    GMTrace.o(3398795526144L, 25323);
  }
  
  public final void cgh()
  {
    boolean bool1 = true;
    GMTrace.i(3398258655232L, 25319);
    if (this.iVA == null) {
      this.iVA = new ArrayList();
    }
    this.iVA.clear();
    int i;
    if ((q.zI() & 0x8000) == 0)
    {
      i = 1;
      boolean bool2 = q.zV();
      if ((i == 0) || (!bool2)) {
        break label145;
      }
      label62:
      if (bool1 != this.wXF)
      {
        if (!bool1) {
          break label150;
        }
        at.AR();
        a(5, (com.tencent.mm.sdk.e.m)com.tencent.mm.y.c.yP(), "floatbottle");
      }
    }
    for (;;)
    {
      this.wXF = bool1;
      if (this.wXF) {
        this.iVA.add("floatbottle");
      }
      this.iVA.add("qmessage");
      GMTrace.o(3398258655232L, 25319);
      return;
      i = 0;
      break;
      label145:
      bool1 = false;
      break label62;
      label150:
      at.AR();
      a(2, (com.tencent.mm.sdk.e.m)com.tencent.mm.y.c.yP(), "floatbottle");
    }
  }
  
  public final void clearCache()
  {
    GMTrace.i(3399600832512L, 25329);
    if (this.woP != null)
    {
      this.woP.clear();
      this.wXE = true;
    }
    GMTrace.o(3399600832512L, 25329);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(3398929743872L, 25324);
    this.wXJ = new a();
    ae localae = (ae)AH(paramInt);
    Object localObject1 = localae.field_username;
    this.wXH.db((String)localObject1);
    Object localObject2;
    Object localObject3;
    int i;
    if (this.wXA.containsKey(localObject1))
    {
      if (paramInt != ((Integer)this.wXA.get(localObject1)).intValue())
      {
        localObject2 = bWv();
        int k;
        if (this.vGN == null)
        {
          paramViewGroup = null;
          localObject3 = new StringBuffer();
          k = localObject2.length;
          i = 0;
        }
        Map.Entry localEntry;
        for (;;)
        {
          if (i >= k) {
            break label251;
          }
          localEntry = localObject2[i];
          int j = 0;
          for (;;)
          {
            if ((j < localEntry.size()) && (j < 50))
            {
              ((StringBuffer)localObject3).append("[");
              ((StringBuffer)localObject3).append(j);
              ((StringBuffer)localObject3).append(",");
              ((StringBuffer)localObject3).append(localEntry.keyAt(j));
              ((StringBuffer)localObject3).append(",");
              ((StringBuffer)localObject3).append((String)localEntry.valueAt(j));
              ((StringBuffer)localObject3).append("]");
              j += 1;
              continue;
              paramViewGroup = this.vGN.vEh.bVg();
              break;
            }
          }
          i += 1;
        }
        label251:
        ((StringBuffer)localObject3).append("\n");
        if (paramViewGroup != null)
        {
          localObject2 = paramViewGroup.entrySet().iterator();
          i = 0;
          while (((Iterator)localObject2).hasNext())
          {
            localEntry = (Map.Entry)((Iterator)localObject2).next();
            if (i >= 50) {
              break;
            }
            i += 1;
            ((StringBuffer)localObject3).append("[");
            ((StringBuffer)localObject3).append(localEntry.getKey());
            ((StringBuffer)localObject3).append(",");
            if (localEntry.getValue() != null) {
              ((StringBuffer)localObject3).append(((ae)localEntry.getValue()).field_username);
            }
            ((StringBuffer)localObject3).append("]");
          }
          ((StringBuffer)localObject3).append("\n");
        }
        localObject2 = ((StringBuffer)localObject3).toString();
        localObject3 = this.wXA.toString();
        if (paramViewGroup == null) {
          break label1666;
        }
        i = paramViewGroup.size();
        w.i("MicroMsg.ConversationWithCacheAdapter", "Get Item duplicated: positionMaps: %s username [%s, %d] Map: %s datas: %d", new Object[] { localObject2, localObject1, Integer.valueOf(paramInt), localObject3, Integer.valueOf(i) });
        if (!this.wXz)
        {
          e.nX(20);
          this.wXz = true;
        }
        if (System.currentTimeMillis() - this.wXK > 3600000L)
        {
          super.n(null, 1);
          this.wXK = System.currentTimeMillis();
        }
      }
      label507:
      if (paramView != null) {
        break label1729;
      }
      paramViewGroup = new f();
      if (!com.tencent.mm.br.a.ed(this.context)) {
        break label1689;
      }
      paramView = View.inflate(this.context, R.i.cuc, null);
      label541:
      paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bfq));
      a.b.a(paramViewGroup.hqG, (String)localObject1);
      localObject2 = (com.tencent.mm.pluginsdk.ui.a)paramViewGroup.hqG.getDrawable();
      if (this.wWx != null) {
        this.wWx.a((d.a)localObject2);
      }
      paramViewGroup.woT = ((NoMeasuredTextView)paramView.findViewById(R.h.bQX));
      paramViewGroup.woU = ((NoMeasuredTextView)paramView.findViewById(R.h.cjq));
      paramViewGroup.wXU = ((ImageView)paramView.findViewById(R.h.bJI));
      paramViewGroup.woV = ((NoMeasuredTextView)paramView.findViewById(R.h.bJH));
      paramViewGroup.jpZ = ((TextView)paramView.findViewById(R.h.chA));
      paramViewGroup.woW = ((ImageView)paramView.findViewById(R.h.bGV));
      paramViewGroup.woY = paramView.findViewById(R.h.bfr);
      paramViewGroup.woX = ((ImageView)paramView.findViewById(R.h.cgK));
      paramViewGroup.wXd = ((ImageView)paramView.findViewById(R.h.bLi));
      paramViewGroup.wXV = ((ImageView)paramView.findViewById(R.h.bOP));
      paramViewGroup.jpZ.setBackgroundResource(com.tencent.mm.ui.tools.s.fH(this.context));
      paramViewGroup.wXW = new c();
      paramView.setTag(paramViewGroup);
      paramViewGroup.woV.J(com.tencent.mm.br.a.V(this.context, R.f.aQP));
      paramViewGroup.woU.J(com.tencent.mm.br.a.V(this.context, R.f.aQR));
      paramViewGroup.woT.J(com.tencent.mm.br.a.V(this.context, R.f.aQF));
      this.wXI = paramViewGroup.woT.fB.getTextSize();
      paramViewGroup.woV.setTextColor(this.woO[0]);
      paramViewGroup.woU.setTextColor(this.woO[4]);
      paramViewGroup.woT.setTextColor(this.woO[3]);
      paramViewGroup.woV.whw = true;
      paramViewGroup.woU.whw = false;
      paramViewGroup.woT.whw = true;
      paramViewGroup.woU.xS();
      label898:
      localObject2 = j(localae);
      if (((d)localObject2).wWQ == null) {
        ((d)localObject2).wWQ = b(localae, (int)paramViewGroup.woV.fB.getTextSize(), ((d)localObject2).wWW);
      }
      if (((d)localObject2).wWP == null) {
        ((d)localObject2).wWP = i(localae);
      }
      if (!((d)localObject2).wWW) {
        break label1740;
      }
      paramViewGroup.woV.setTextColor(this.woO[0]);
      label981:
      com.tencent.mm.booter.notification.a.h.ed(paramViewGroup.woV.getWidth());
      com.tencent.mm.booter.notification.a.h.ee((int)paramViewGroup.woV.fB.getTextSize());
      com.tencent.mm.booter.notification.a.h.a(paramViewGroup.woV.fB);
      if (!((String)localObject1).toLowerCase().endsWith("@t.qq.com")) {
        break label1760;
      }
      paramViewGroup.woT.Cg(R.g.aXn);
      paramViewGroup.woT.lL(true);
      label1047:
      paramInt = ((d)localObject2).wWR;
      if (paramInt == -1) {
        break label1771;
      }
      paramViewGroup.woV.Cf(paramInt);
      paramViewGroup.woV.lK(true);
      w.i("MicroMsg.ConversationWithCacheAdapter", "userName:%s, status:%d", new Object[] { localObject1, Integer.valueOf(((d)localObject2).wWR) });
      label1102:
      paramViewGroup.woT.setText(((d)localObject2).nickName);
      localObject3 = paramViewGroup.woU.getLayoutParams();
      if (((d)localObject2).wWP.length() < 9) {
        break label1789;
      }
      if (((ViewGroup.LayoutParams)localObject3).width != this.wWH)
      {
        ((ViewGroup.LayoutParams)localObject3).width = this.wWH;
        paramViewGroup.woU.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      }
      label1168:
      paramViewGroup.woU.setText(((d)localObject2).wWP);
      paramViewGroup.woV.setText(((d)localObject2).wWQ);
      paramViewGroup.wXU.setVisibility(8);
      paramViewGroup.woW.setVisibility(8);
      if (!((d)localObject2).sdk) {
        break label1822;
      }
      if (((d)localObject2).wWY) {
        paramViewGroup.woW.setVisibility(0);
      }
      label1234:
      a.b.a(paramViewGroup.hqG, (String)localObject1);
      if (this.wWv)
      {
        if ((localae != null) && (paramViewGroup != null) && (localObject2 != null)) {
          break label1841;
        }
        w.w("MicroMsg.ConversationWithCacheAdapter", "handle show tip cnt, but conversation or viewholder is null");
      }
      label1272:
      if ((!((d)localObject2).wWU) && (((d)localObject2).woQ) && (at.AU()))
      {
        at.AR();
        com.tencent.mm.y.c.yP().f(localae);
      }
      if ((!((d)localObject2).woQ) || (localae.field_conversationTime == -1L)) {
        break label2068;
      }
      paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVN);
      label1342:
      if (Build.VERSION.SDK_INT >= 21) {
        paramView.findViewById(R.h.bsb).setOnTouchListener(new View.OnTouchListener()
        {
          @TargetApi(21)
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(3426847031296L, 25532);
            paramAnonymousView.findViewById(R.h.bsb).getBackground().setHotspot(paramAnonymousMotionEvent.getX(), paramAnonymousMotionEvent.getY());
            GMTrace.o(3426847031296L, 25532);
            return false;
          }
        });
      }
      com.tencent.mm.bj.d.bNA();
      if ((0L != com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localae, 7, 0L)) && (!localae.field_username.equals(this.wXw.eVT.eVW)))
      {
        localae.y(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localae, 6, localae.field_conversationTime));
        at.AR();
        com.tencent.mm.y.c.yP().a(localae, localae.field_username);
      }
      if ((p.a.tlV != null) && (p.a.tlV.JD(localae.field_username))) {
        break label2084;
      }
      paramViewGroup.woX.setVisibility(8);
      label1474:
      if ((p.a.tmc == null) || (!p.a.tmc.Bj(localae.field_username))) {
        break label2139;
      }
      paramViewGroup.wXd.setVisibility(0);
      label1504:
      if ((!com.tencent.mm.y.s.eb(localae.field_username)) || (p.a.tmd == null) || (!p.a.tmd.CT(localae.field_username))) {
        break label2164;
      }
      if ((!p.a.tmd.aRs()) || (!p.a.tmd.cX(localae.field_username, q.zE()))) {
        break label2151;
      }
      paramViewGroup.wXV.setImageResource(R.k.cLj);
      label1577:
      paramViewGroup.wXV.setVisibility(0);
    }
    for (;;)
    {
      this.wXJ.content = String.valueOf(((d)localObject2).wWQ);
      this.wXJ.aDn = ((d)localObject2).fMz;
      this.wXJ.wWO = String.valueOf(((d)localObject2).wWP);
      paramViewGroup = this.wXJ;
      a.a.vOX.a(paramView, paramViewGroup.aDn, paramViewGroup.wWN, paramViewGroup.wWO, paramViewGroup.content);
      GMTrace.o(3398929743872L, 25324);
      return paramView;
      label1666:
      i = 0;
      break;
      this.wXA.put(localObject1, Integer.valueOf(paramInt));
      break label507;
      label1689:
      if (com.tencent.mm.br.a.ee(this.context))
      {
        paramView = View.inflate(this.context, R.i.cud, null);
        break label541;
      }
      paramView = View.inflate(this.context, R.i.cub, null);
      break label541;
      label1729:
      paramViewGroup = (f)paramView.getTag();
      break label898;
      label1740:
      paramViewGroup.woV.setTextColor(this.woO[localObject2.jHw]);
      break label981;
      label1760:
      paramViewGroup.woT.lL(false);
      break label1047;
      label1771:
      paramViewGroup.woV.lK(false);
      paramViewGroup.woV.invalidate();
      break label1102;
      label1789:
      if (((ViewGroup.LayoutParams)localObject3).width == this.wWG) {
        break label1168;
      }
      ((ViewGroup.LayoutParams)localObject3).width = this.wWG;
      paramViewGroup.woU.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      break label1168;
      label1822:
      if (!((d)localObject2).wWV) {
        break label1234;
      }
      paramViewGroup.woW.setVisibility(0);
      break label1234;
      label1841:
      paramViewGroup.jpZ.setVisibility(4);
      paramViewGroup.woY.setVisibility(4);
      if ((!com.tencent.mm.y.s.fz(localae.field_username)) && (((d)localObject2).wWX) && ((((d)localObject2).wWT == 1) || (((d)localObject2).wWT == 2) || (((d)localObject2).wWT == 3))) {}
      for (localObject1 = this.woO[2];; localObject1 = this.woO[3])
      {
        paramViewGroup.woT.setTextColor((ColorStateList)localObject1);
        if ((((d)localObject2).wWX) && (((d)localObject2).wWS != 0)) {
          break label1958;
        }
        w.w("MicroMsg.ConversationWithCacheAdapter", "handle show tip count, but talker is null");
        break;
      }
      label1958:
      paramInt = a(localae, (d)localObject2);
      if (paramInt == 1)
      {
        paramViewGroup.woY.setVisibility(0);
        break label1272;
      }
      if (paramInt != 2) {
        break label1272;
      }
      paramInt = localae.field_unReadCount;
      if (paramInt > 99)
      {
        paramViewGroup.jpZ.setText(R.l.efe);
        paramViewGroup.jpZ.setVisibility(0);
      }
      for (;;)
      {
        this.wXJ.wWN = paramInt;
        break;
        if (paramInt > 0)
        {
          paramViewGroup.jpZ.setText(localae.field_unReadCount);
          paramViewGroup.jpZ.setVisibility(0);
        }
      }
      label2068:
      paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVO);
      break label1342;
      label2084:
      paramViewGroup.woX.setVisibility(0);
      if (localae.field_username.equals(this.wXw.eVT.eVW))
      {
        paramViewGroup.woX.setImageResource(R.k.cOZ);
        break label1474;
      }
      paramViewGroup.woX.setImageResource(R.k.cOY);
      break label1474;
      label2139:
      paramViewGroup.wXd.setVisibility(8);
      break label1504;
      label2151:
      paramViewGroup.wXV.setImageResource(R.k.cLk);
      break label1577;
      label2164:
      paramViewGroup.wXV.setVisibility(8);
    }
  }
  
  final d j(ae paramae)
  {
    boolean bool2 = true;
    GMTrace.i(3399063961600L, 25325);
    String str2 = paramae.field_username;
    Object localObject = (d)this.woP.get(str2);
    if (localObject != null)
    {
      GMTrace.o(3399063961600L, 25325);
      return (d)localObject;
    }
    d locald = new d();
    this.wXH.db(str2);
    x localx = this.wXH.chb();
    label110:
    label131:
    label152:
    label193:
    int i;
    if (localx != null)
    {
      locald.wWT = localx.fjs;
      locald.wWS = ((int)localx.fTq);
      if (localx == null) {
        break label576;
      }
      bool1 = true;
      locald.wWX = bool1;
      if ((localx == null) || (!localx.vd())) {
        break label581;
      }
      bool1 = true;
      locald.wWZ = bool1;
      if ((localx == null) || (localx.fji != 0)) {
        break label586;
      }
      bool1 = true;
      locald.wWY = bool1;
      locald.sdk = com.tencent.mm.y.s.eb(str2);
      if ((!locald.sdk) || (!locald.wWY) || (paramae.field_unReadCount <= 0)) {
        break label591;
      }
      bool1 = true;
      locald.wWW = bool1;
      locald.jHw = 0;
      if ((tE(paramae.field_msgType) == 34) && (paramae.field_isSend == 0) && (!com.tencent.mm.platformtools.t.nm(paramae.field_content)))
      {
        String str1 = paramae.field_content;
        if ((!str2.equals("qmessage")) && (!str2.equals("floatbottle")) && (!str2.equals("officialaccounts")) && (!paramae.eH(2097152)))
        {
          localObject = str1;
          if (!paramae.eH(8388608)) {}
        }
        else
        {
          String[] arrayOfString = str1.split(":");
          localObject = str1;
          if (arrayOfString != null)
          {
            localObject = str1;
            if (arrayOfString.length > 3) {
              localObject = arrayOfString[1] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
            }
          }
        }
        if (!new com.tencent.mm.modelvoice.n((String)localObject).hco) {
          locald.jHw = 1;
        }
      }
      locald.fMz = r.a(localx, str2, locald.sdk);
      a(locald);
      locald.wWP = i(paramae);
      switch (paramae.field_status)
      {
      case 3: 
      case 4: 
      case 6: 
      case 7: 
      default: 
        i = -1;
        label482:
        locald.wWR = i;
        locald.wWU = com.tencent.mm.y.s.a(paramae);
        at.AR();
        locald.woQ = com.tencent.mm.y.c.yP().g(paramae);
        if ((localx == null) || (!localx.vc())) {
          break;
        }
      }
    }
    for (boolean bool1 = bool2;; bool1 = false)
    {
      locald.wWV = bool1;
      this.woP.put(str2, locald);
      GMTrace.o(3399063961600L, 25325);
      return locald;
      locald.wWT = -1;
      locald.wWS = -1;
      break;
      label576:
      bool1 = false;
      break label110;
      label581:
      bool1 = false;
      break label131;
      label586:
      bool1 = false;
      break label152;
      label591:
      bool1 = false;
      break label193;
      i = -1;
      break label482;
      i = R.k.cNc;
      break label482;
      i = -1;
      break label482;
      i = R.k.cNb;
      break label482;
    }
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(17879009329152L, 133209);
    super.notifyDataSetChanged();
    this.wXA.clear();
    w.i("MicroMsg.ConversationWithCacheAdapter", "clear usernamePositionMap");
    GMTrace.o(17879009329152L, 133209);
  }
  
  public final void onPause()
  {
    GMTrace.i(3398392872960L, 25320);
    w.d("MicroMsg.ConversationWithCacheAdapter", "unreadcheck adpter onPause  hasResume " + this.wDw);
    if (!this.wDw)
    {
      GMTrace.o(3398392872960L, 25320);
      return;
    }
    this.wDw = false;
    super.pause();
    if (this.jpT != null) {
      this.jpT.aJp();
    }
    GMTrace.o(3398392872960L, 25320);
  }
  
  public final void onResume()
  {
    GMTrace.i(3398661308416L, 25322);
    w.d("MicroMsg.ConversationWithCacheAdapter", "unreadcheck adpter onResume  hasResume " + this.wDw);
    if (this.wDw)
    {
      GMTrace.o(3398661308416L, 25322);
      return;
    }
    this.wDw = true;
    cgh();
    cgZ();
    w.i(this.TAG, "newcursor resume syncNow ");
    this.vGM = true;
    kU(true);
    Object localObject = new Time();
    ((Time)localObject).setToNow();
    localObject = com.tencent.mm.pluginsdk.i.m.a("MM/dd", (Time)localObject).toString();
    String str = v.bPK();
    if ((!this.wWE.equals(localObject)) || (!this.wXG.equals(str))) {}
    for (int i = 1;; i = 0)
    {
      this.wWE = ((String)localObject);
      this.wXG = str;
      if (i != 0) {
        cgU();
      }
      if ((this.wWz) && (this.wXx != null))
      {
        this.wXx.cha();
        this.wWz = false;
        super.n(null, 1);
      }
      this.wXw = new rb();
      this.wXw.eVS.eVU = true;
      com.tencent.mm.sdk.b.a.vgX.m(this.wXw);
      GMTrace.o(3398661308416L, 25322);
      return;
    }
  }
  
  private final class a
  {
    public String aDn;
    public String content;
    public int wWN;
    public String wWO;
    
    public a()
    {
      GMTrace.i(3374636335104L, 25143);
      GMTrace.o(3374636335104L, 25143);
    }
  }
  
  public static abstract interface b
  {
    public abstract void cha();
  }
  
  final class c
  {
    public View jqa;
    public TextView jqb;
    String username;
    boolean wXM;
    boolean wXN;
    boolean wXO;
    boolean wXP;
    boolean wXQ;
    public ImageView wXR;
    public TextView wXS;
    public View wXT;
    public View web;
    
    c()
    {
      GMTrace.i(3416109613056L, 25452);
      this.username = "";
      this.wXM = false;
      this.wXN = false;
      this.wXO = false;
      this.wXP = false;
      this.wXQ = false;
      this.jqa = null;
      this.web = null;
      this.wXR = null;
      this.wXS = null;
      this.jqb = null;
      this.wXT = null;
      GMTrace.o(3416109613056L, 25452);
    }
  }
  
  private final class d
  {
    public String fMz;
    public int jHw;
    public CharSequence nickName;
    public boolean sdk;
    public CharSequence wWP;
    public CharSequence wWQ;
    public int wWR;
    public int wWS;
    public int wWT;
    public boolean wWU;
    public boolean wWV;
    public boolean wWW;
    public boolean wWX;
    public boolean wWY;
    public boolean wWZ;
    public boolean woQ;
    
    public d()
    {
      GMTrace.i(3436510707712L, 25604);
      GMTrace.o(3436510707712L, 25604);
    }
  }
  
  private final class e
  {
    private String eDs;
    private boolean fUo;
    private x iBi;
    private Integer wXb;
    
    public e()
    {
      GMTrace.i(3418122878976L, 25467);
      this.fUo = false;
      this.eDs = null;
      this.fUo = false;
      this.iBi = null;
      this.wXb = null;
      GMTrace.o(3418122878976L, 25467);
    }
    
    public final x chb()
    {
      GMTrace.i(3418391314432L, 25469);
      if ((this.fUo) && (this.iBi == null) && (at.AU()))
      {
        at.AR();
        this.iBi = com.tencent.mm.y.c.yK().TE(this.eDs);
      }
      x localx = this.iBi;
      GMTrace.o(3418391314432L, 25469);
      return localx;
    }
    
    public final void db(String paramString)
    {
      GMTrace.i(3418257096704L, 25468);
      this.eDs = paramString;
      this.iBi = null;
      this.wXb = null;
      this.fUo = false;
      if (!com.tencent.mm.platformtools.t.nm(paramString)) {
        this.fUo = true;
      }
      GMTrace.o(3418257096704L, 25468);
    }
  }
  
  public static final class f
  {
    public ImageView hqG;
    public TextView jpZ;
    public ImageView wXU;
    public ImageView wXV;
    public g.c wXW;
    public ImageView wXd;
    public NoMeasuredTextView woT;
    public NoMeasuredTextView woU;
    public NoMeasuredTextView woV;
    public ImageView woW;
    public ImageView woX;
    public View woY;
    
    public f()
    {
      GMTrace.i(3388460761088L, 25246);
      GMTrace.o(3388460761088L, 25246);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */