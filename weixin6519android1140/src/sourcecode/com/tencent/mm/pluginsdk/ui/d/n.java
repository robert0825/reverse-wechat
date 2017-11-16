package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.comm.a.c;
import com.tencent.mm.plugin.comm.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class n
{
  private static final f<String, SpannableString> tEC;
  String hNz;
  private TextView jU;
  private Context mContext;
  private ArrayList<com.tencent.mm.pluginsdk.ui.applet.k> tED;
  private ArrayList<a> tEE;
  private ArrayList<com.tencent.mm.pluginsdk.ui.applet.p> tEF;
  boolean tEG;
  boolean tEH;
  boolean tEI;
  boolean tEJ;
  boolean tEK;
  boolean tEL;
  boolean tEM;
  boolean tEN;
  boolean tEO;
  boolean tEP;
  boolean tEQ;
  int tER;
  private int tES;
  boolean tET;
  Object tEU;
  
  static
  {
    GMTrace.i(1217489010688L, 9071);
    tEC = new f(500);
    GMTrace.o(1217489010688L, 9071);
  }
  
  public n(Context paramContext)
  {
    GMTrace.i(1215207309312L, 9054);
    this.tED = new ArrayList();
    this.tEE = new ArrayList();
    this.tEF = new ArrayList();
    this.jU = null;
    this.tEG = false;
    this.tEH = false;
    this.tEI = false;
    this.tEJ = true;
    this.tEK = true;
    this.tEL = false;
    this.tEM = false;
    this.tEN = false;
    this.tEO = false;
    this.tEP = false;
    this.tEQ = true;
    this.tER = 0;
    this.tES = 0;
    this.mContext = null;
    this.tET = false;
    this.tED = new ArrayList();
    this.tEE = new ArrayList();
    this.tEF = new ArrayList();
    this.mContext = paramContext;
    GMTrace.o(1215207309312L, 9054);
  }
  
  private CharSequence A(CharSequence paramCharSequence)
  {
    GMTrace.i(1215744180224L, 9058);
    Object localObject2 = g.a.tDQ.matcher(paramCharSequence.toString());
    Object localObject1 = paramCharSequence;
    paramCharSequence = (CharSequence)localObject2;
    if (paramCharSequence.find())
    {
      if (this.tEO) {
        paramCharSequence = ((CharSequence)localObject1).toString().replace(paramCharSequence.group(0), "");
      }
      for (;;)
      {
        localObject2 = g.a.tDN.matcher(paramCharSequence);
        localObject1 = paramCharSequence;
        paramCharSequence = (CharSequence)localObject2;
        break;
        localObject1 = ((CharSequence)localObject1).toString().replace(paramCharSequence.group(0), "  ");
        localObject2 = paramCharSequence.group(1);
        int i = paramCharSequence.start();
        int j = this.mContext.getResources().getIdentifier(((String)localObject2).toLowerCase(), "drawable", this.mContext.getPackageName());
        if (j != 0)
        {
          paramCharSequence = new com.tencent.mm.pluginsdk.ui.applet.p(i, i + 2, j);
          if ((!bg.nm((String)localObject2)) && ("original_label".equals(localObject2)))
          {
            paramCharSequence.height = 15;
            paramCharSequence.width = 35;
          }
          this.tEF.add(paramCharSequence);
          paramCharSequence = (CharSequence)localObject1;
        }
        else
        {
          w.w("MicroMsg.SpanProcessor", "dz[parseImgSpan:error drawable name %s]", new Object[] { localObject2 });
          paramCharSequence = (CharSequence)localObject1;
        }
      }
    }
    GMTrace.o(1215744180224L, 9058);
    return (CharSequence)localObject1;
  }
  
  private CharSequence B(CharSequence paramCharSequence)
  {
    GMTrace.i(1215878397952L, 9059);
    Object localObject2 = g.a.tDO.matcher(paramCharSequence);
    Object localObject1 = paramCharSequence;
    int i = 0;
    String str1;
    String str2;
    int j;
    for (;;)
    {
      if (((Matcher)localObject2).find())
      {
        String str3 = ((Matcher)localObject2).group(0);
        localObject3 = ((Matcher)localObject2).group(1);
        str1 = ((Matcher)localObject2).group(2);
        str2 = ((Matcher)localObject2).group(3);
        if (str1.length() < 2) {
          continue;
        }
        localObject1 = ((CharSequence)localObject1).toString().replace(str3, str2);
        j = ((Matcher)localObject2).start(0);
        int k = str2.length() + j;
        if ((j < 0) || (k > paramCharSequence.length()))
        {
          w.e("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error: start:%d, end:%d, source.length:%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramCharSequence.length()) });
          continue;
        }
        try
        {
          i = Color.parseColor((String)localObject3);
          localObject2 = a.a(this.mContext, str1, j, k, i, i & 0x99FFFFFF);
          if (localObject2 != null)
          {
            if (this.tEU != null) {
              ((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).data = this.tEU;
            }
            this.tED.add(localObject2);
            this.tEE.add(new a(j, k));
          }
          localObject2 = g.a.tDO.matcher((CharSequence)localObject1);
          i = 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.w("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error at color : %s]", new Object[] { localObject3 });
            i = 0;
          }
        }
      }
    }
    Object localObject3 = localObject1;
    if (i == 0)
    {
      Matcher localMatcher = g.a.tDP.matcher(paramCharSequence);
      for (;;)
      {
        localObject3 = localObject1;
        if (!localMatcher.find()) {
          break;
        }
        str2 = localMatcher.group(0);
        localObject3 = localMatcher.group(1);
        str1 = localMatcher.group(2);
        if (((String)localObject3).length() >= 2)
        {
          localObject1 = ((CharSequence)localObject1).toString().replace(str2, str1);
          i = localMatcher.start(0);
          j = str1.length() + i;
          if ((i < 0) || (j > paramCharSequence.length()))
          {
            w.e("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error: start:%d, end:%d, source.length:%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramCharSequence.length()) });
          }
          else
          {
            S((String)localObject3, i, j);
            localMatcher = g.a.tDO.matcher((CharSequence)localObject1);
          }
        }
      }
    }
    GMTrace.o(1215878397952L, 9059);
    return (CharSequence)localObject3;
  }
  
  private CharSequence C(CharSequence paramCharSequence)
  {
    GMTrace.i(1216012615680L, 9060);
    Matcher localMatcher = g.a.tDN.matcher(paramCharSequence.toString());
    Object localObject = paramCharSequence;
    while (localMatcher.find())
    {
      String str3 = localMatcher.group(0);
      String str1 = localMatcher.group(1);
      String str2 = localMatcher.group(2);
      if (str1.length() >= 2)
      {
        localObject = ((CharSequence)localObject).toString().replace(str3, str2);
        int i = localMatcher.start(0);
        int j = str2.length() + i;
        if ((i < 0) || (j > paramCharSequence.length()))
        {
          w.e("MicroMsg.SpanProcessor", "parseHref error, start:%d, end:%d, source.length:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramCharSequence.length()) });
        }
        else
        {
          S(str1, i, j);
          localMatcher = g.a.tDN.matcher((CharSequence)localObject);
        }
      }
    }
    GMTrace.o(1216012615680L, 9060);
    return (CharSequence)localObject;
  }
  
  private CharSequence D(CharSequence paramCharSequence)
  {
    GMTrace.i(20284593668096L, 151132);
    Object localObject2 = g.a.tDN.matcher(paramCharSequence.toString());
    Object localObject1 = paramCharSequence;
    while (((Matcher)localObject2).find())
    {
      String str4 = ((Matcher)localObject2).group(0);
      Object localObject3 = bh.q(str4, "a");
      if (localObject3 == null)
      {
        w.e("MicroMsg.SpanProcessor", "XmlParser parse return null, so continue");
      }
      else
      {
        String str2 = (String)((Map)localObject3).get(".a.$href");
        String str3 = (String)((Map)localObject3).get(".a");
        String str1 = (String)((Map)localObject3).get(".a.$data-miniprogram-appid");
        localObject3 = (String)((Map)localObject3).get(".a.$data-miniprogram-path");
        int i;
        label138:
        int j;
        if (!bg.nm(str2))
        {
          i = 1;
          if (bg.nm(str1)) {
            break label256;
          }
          j = 1;
        }
        for (;;)
        {
          if ((i != 0) && (j == 0))
          {
            if (str2.length() < 2) {
              break;
            }
            localObject1 = ((CharSequence)localObject1).toString().replace(str4, str3);
            i = ((Matcher)localObject2).start(0);
            j = str3.length() + i;
            if ((i < 0) || (j > paramCharSequence.length()))
            {
              w.e("MicroMsg.SpanProcessor", "parseHref error, start:%d, end:%d, source.length:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramCharSequence.length()) });
              break;
              i = 0;
              break label138;
              label256:
              j = 0;
              continue;
            }
            S(str2, i, j);
          }
        }
        for (;;)
        {
          localObject2 = g.a.tDN.matcher((CharSequence)localObject1);
          break;
          if (j == 0) {
            break label485;
          }
          if (this.tEO)
          {
            localObject1 = ((CharSequence)localObject1).toString().replace(str4, str3);
            i = ((Matcher)localObject2).start(0);
            j = str3.length();
            localObject2 = new com.tencent.mm.pluginsdk.ui.applet.k(str2, 45, null);
            ((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).start = i;
            ((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).end = (j + i);
            this.tED.add(localObject2);
          }
          else
          {
            str2 = "    " + str3;
            localObject1 = ((CharSequence)localObject1).toString().replace(str4, str2);
            i = ((Matcher)localObject2).start(0);
            j = str2.length();
            localObject2 = new com.tencent.mm.pluginsdk.ui.applet.p(i + 1, i + 3, a.g.kbT);
            this.tEF.add(localObject2);
            localObject2 = new com.tencent.mm.pluginsdk.ui.applet.k(str1, 45, localObject3);
            ((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).start = (i + 4);
            ((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).end = (j + i);
            this.tED.add(localObject2);
          }
        }
        label485:
        w.e("MicroMsg.SpanProcessor", "url && appId is null, continue");
      }
    }
    GMTrace.o(20284593668096L, 151132);
    return (CharSequence)localObject1;
  }
  
  private ArrayList<a> E(CharSequence paramCharSequence)
  {
    int i = 2000;
    GMTrace.i(1216146833408L, 9061);
    ArrayList localArrayList = new ArrayList();
    Object localObject = g.a.tDU;
    if (paramCharSequence.length() > 2000) {}
    for (;;)
    {
      paramCharSequence = ((Pattern)localObject).matcher(paramCharSequence.subSequence(0, i));
      while (paramCharSequence.find())
      {
        i = paramCharSequence.start();
        int j = paramCharSequence.end();
        localObject = new com.tencent.mm.pluginsdk.ui.applet.k(paramCharSequence.group(), 24, null);
        ((com.tencent.mm.pluginsdk.ui.applet.k)localObject).start = i;
        ((com.tencent.mm.pluginsdk.ui.applet.k)localObject).end = j;
        if (!a(this.tEE, new a(i, j)))
        {
          this.tED.add(localObject);
          localArrayList.add(new a(i, j));
        }
      }
      i = paramCharSequence.length();
    }
    GMTrace.o(1216146833408L, 9061);
    return localArrayList;
  }
  
  private ArrayList<a> F(CharSequence paramCharSequence)
  {
    GMTrace.i(1216281051136L, 9062);
    ArrayList localArrayList = new ArrayList();
    String str = paramCharSequence.toString();
    if (str.length() > 500) {
      paramCharSequence = g.a.tDT.matcher(str.toLowerCase());
    }
    while (paramCharSequence.find())
    {
      int i = paramCharSequence.start();
      int j = paramCharSequence.end();
      if ((!a(this.tEE, new a(i, j))) && (i >= 0) && (j <= str.length())) {
        if (j < str.length())
        {
          int k = str.charAt(j);
          if ((97 <= k) && (k <= 122)) {}
        }
        else
        {
          com.tencent.mm.pluginsdk.ui.applet.k localk = new com.tencent.mm.pluginsdk.ui.applet.k(str.substring(i, j), 1, this.tEU);
          localk.start = i;
          localk.end = j;
          this.tED.add(localk);
          localArrayList.add(new a(i, j));
          continue;
          paramCharSequence = g.a.tDS.matcher(str.toLowerCase());
        }
      }
    }
    GMTrace.o(1216281051136L, 9062);
    return localArrayList;
  }
  
  private ArrayList<a> G(CharSequence paramCharSequence)
  {
    GMTrace.i(18727668023296L, 139532);
    ArrayList localArrayList = new ArrayList();
    paramCharSequence = paramCharSequence.toString();
    if (paramCharSequence.length() > 200)
    {
      GMTrace.o(18727668023296L, 139532);
      return localArrayList;
    }
    Matcher localMatcher = g.a.tDZ.matcher(paramCharSequence);
    while (localMatcher.find())
    {
      int i = localMatcher.start();
      int j = localMatcher.end();
      if ((!a(this.tEE, new a(i, j))) && (i >= 0) && (j <= paramCharSequence.length()))
      {
        com.tencent.mm.pluginsdk.ui.applet.k localk = new com.tencent.mm.pluginsdk.ui.applet.k(paramCharSequence.substring(i, j), 44, this.tEU);
        localk.start = i;
        localk.end = j;
        this.tED.add(localk);
        localArrayList.add(new a(i, j));
      }
    }
    GMTrace.o(18727668023296L, 139532);
    return localArrayList;
  }
  
  private ArrayList<a> H(CharSequence paramCharSequence)
  {
    GMTrace.i(1216415268864L, 9063);
    ArrayList localArrayList = new ArrayList();
    String str = paramCharSequence.toString();
    paramCharSequence = g.a.tDW.matcher(paramCharSequence);
    while (paramCharSequence.find())
    {
      int i = paramCharSequence.start();
      int j = paramCharSequence.end();
      if ((!a(this.tEE, new a(i, j))) && (i >= 0) && (j <= str.length()))
      {
        com.tencent.mm.pluginsdk.ui.applet.k localk = new com.tencent.mm.pluginsdk.ui.applet.k(str.substring(i, j), 28, null);
        localk.start = i;
        localk.end = j;
        this.tED.add(localk);
        localArrayList.add(new a(i, j));
      }
    }
    GMTrace.o(1216415268864L, 9063);
    return localArrayList;
  }
  
  private ArrayList<a> I(CharSequence paramCharSequence)
  {
    GMTrace.i(1216549486592L, 9064);
    ArrayList localArrayList = new ArrayList();
    paramCharSequence = g.a.tDV.matcher(paramCharSequence);
    while (paramCharSequence.find())
    {
      int k = paramCharSequence.start();
      int m = paramCharSequence.end();
      Object localObject = paramCharSequence.group();
      int j = m - k;
      int i = j;
      if (((String)localObject).startsWith("+")) {
        i = j - 1;
      }
      if (((i != 6) && (i != 5)) || (("+12306+12110+12395+12121+12117+12119+95555+95566+95533+95588+95558+95599+95568+95595+95559+95508+95528+95501+95577+95561+10086+10010+10000+17951+17911+17900+118114+116114+950718+95598+12318+12315+12358+12365+12310+12369+12333+12366+95518+95519+95511+95500+95522+95567".contains((CharSequence)localObject)) && (i < 24) && (!a(this.tEE, new a(k, m)))))
      {
        localObject = new com.tencent.mm.pluginsdk.ui.applet.k((String)localObject, 25, this.tEU);
        ((com.tencent.mm.pluginsdk.ui.applet.k)localObject).start = k;
        ((com.tencent.mm.pluginsdk.ui.applet.k)localObject).end = m;
        this.tED.add(localObject);
        localArrayList.add(new a(k, m));
      }
    }
    GMTrace.o(1216549486592L, 9064);
    return localArrayList;
  }
  
  private ArrayList<a> J(CharSequence paramCharSequence)
  {
    GMTrace.i(1216683704320L, 9065);
    ArrayList localArrayList = new ArrayList();
    paramCharSequence = a.aV(this.mContext, paramCharSequence.toString()).iterator();
    while (paramCharSequence.hasNext())
    {
      com.tencent.mm.pluginsdk.ui.applet.k localk = (com.tencent.mm.pluginsdk.ui.applet.k)paramCharSequence.next();
      a locala = new a(localk.start, localk.end);
      if (!a(this.tEE, locala))
      {
        this.tED.add(localk);
        localArrayList.add(locala);
      }
    }
    GMTrace.o(1216683704320L, 9065);
    return localArrayList;
  }
  
  private ArrayList<a> K(CharSequence paramCharSequence)
  {
    GMTrace.i(1216817922048L, 9066);
    ArrayList localArrayList = new ArrayList();
    paramCharSequence = paramCharSequence.toString();
    Matcher localMatcher = g.a.tDY.matcher(paramCharSequence);
    int i;
    int j;
    a locala;
    com.tencent.mm.pluginsdk.ui.applet.k localk;
    while (localMatcher.find())
    {
      i = localMatcher.start();
      j = localMatcher.end();
      locala = new a(i, j);
      if ((!a(this.tEE, locala)) && (i >= 0) && (j <= paramCharSequence.length()))
      {
        localk = new com.tencent.mm.pluginsdk.ui.applet.k(paramCharSequence.substring(i, j), 30, null);
        localk.start = i;
        localk.end = j;
        this.tED.add(localk);
        localArrayList.add(locala);
      }
    }
    if (localArrayList.size() <= 0)
    {
      localMatcher = g.a.tDX.matcher(paramCharSequence);
      while (localMatcher.find())
      {
        i = localMatcher.start();
        j = localMatcher.end();
        locala = new a(i, j);
        if ((!a(this.tEE, locala)) && (i >= 0) && (j <= paramCharSequence.length()))
        {
          localk = new com.tencent.mm.pluginsdk.ui.applet.k(paramCharSequence.substring(i, j), 30, null);
          localk.start = i;
          localk.end = j;
          this.tED.add(localk);
          localArrayList.add(locala);
        }
      }
    }
    GMTrace.o(1216817922048L, 9066);
    return localArrayList;
  }
  
  private boolean S(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17439446269952L, 129934);
    paramString = a.a(this.mContext, paramString, paramInt1, paramInt2);
    if (paramString != null)
    {
      if (this.tEU != null) {
        paramString.data = this.tEU;
      }
      this.tED.add(paramString);
      this.tEE.add(new a(paramInt1, paramInt2));
      GMTrace.o(17439446269952L, 129934);
      return true;
    }
    GMTrace.o(17439446269952L, 129934);
    return false;
  }
  
  private static boolean a(ArrayList<a> paramArrayList, a parama)
  {
    GMTrace.i(1216952139776L, 9067);
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      a locala = (a)paramArrayList.next();
      if ((locala.end > parama.start) && (parama.end > locala.start)) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(1216952139776L, 9067);
        return true;
      }
    }
    GMTrace.o(1216952139776L, 9067);
    return false;
  }
  
  private void bNe()
  {
    GMTrace.i(1217220575232L, 9069);
    if (this.jU != null)
    {
      k localk = new k();
      localk.hNz = this.hNz;
      this.jU.setOnTouchListener(localk);
    }
    GMTrace.o(1217220575232L, 9069);
  }
  
  public static void clearCache()
  {
    GMTrace.i(1217354792960L, 9070);
    tEC.clear();
    GMTrace.o(1217354792960L, 9070);
  }
  
  private static void e(Spannable paramSpannable)
  {
    int i = 0;
    GMTrace.i(1215609962496L, 9057);
    Object[] arrayOfObject = paramSpannable.getSpans(0, paramSpannable.length(), Object.class);
    while (i < arrayOfObject.length)
    {
      if ((!(arrayOfObject[i] instanceof e)) && (!(arrayOfObject[i] instanceof l))) {
        paramSpannable.removeSpan(arrayOfObject[i]);
      }
      i += 1;
    }
    GMTrace.o(1215609962496L, 9057);
  }
  
  private void f(Spannable paramSpannable)
  {
    GMTrace.i(1217086357504L, 9068);
    if ((this.jU != null) && (!bg.nm(paramSpannable.toString())))
    {
      if (r.hkI)
      {
        this.jU.setText(paramSpannable, TextView.BufferType.SPANNABLE);
        GMTrace.o(1217086357504L, 9068);
        return;
      }
      this.jU.setText(paramSpannable);
    }
    GMTrace.o(1217086357504L, 9068);
  }
  
  public final SpannableString a(CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1215475744768L, 9056);
    if (paramCharSequence == null)
    {
      paramCharSequence = new SpannableString("");
      GMTrace.o(1215475744768L, 9056);
      return paramCharSequence;
    }
    this.tES = paramInt;
    String str = paramCharSequence + "@" + this.tES + "@" + this.tEG + "@" + this.tEI + "@" + this.tEJ + "@" + this.tEK + "@" + this.tER + "@" + this.tET + "@" + this.tEN + "@" + this.tEO + "@" + this.tEP;
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = (SpannableString)tEC.get(str);
      if (localObject1 != null)
      {
        e((Spannable)localObject1);
        f((Spannable)localObject1);
        bNe();
        GMTrace.o(1215475744768L, 9056);
        return (SpannableString)localObject1;
      }
    }
    this.tED = new ArrayList();
    if (this.tES <= 0)
    {
      if (this.jU != null) {
        this.tES = ((int)this.jU.getTextSize());
      }
    }
    else
    {
      if (this.tED == null) {
        this.tED = new ArrayList();
      }
      if (this.tEE == null) {
        this.tEE = new ArrayList();
      }
      this.tED.clear();
      this.tEE.clear();
      if (paramCharSequence == null) {
        break label813;
      }
      if (com.tencent.mm.compatible.d.p.fQL.fPz != 1) {
        break label777;
      }
      paramInt = 1;
      label337:
      localObject1 = paramCharSequence;
      if (paramInt != 0)
      {
        localObject1 = paramCharSequence;
        if (this.tEQ)
        {
          localObject1 = paramCharSequence;
          if (d.a.tDM != null) {
            if (!d.a.tDM.x(paramCharSequence))
            {
              localObject1 = paramCharSequence;
              if (!d.a.tDM.w(paramCharSequence)) {}
            }
            else
            {
              localObject1 = paramCharSequence.toString().replace("\n", "                                                                                                                                                                                                                                                                                                                        ");
            }
          }
        }
      }
      paramCharSequence = (CharSequence)localObject1;
      if (this.tEG)
      {
        if (!((CharSequence)localObject1).toString().contains("data-miniprogram-appid")) {
          break label818;
        }
        paramCharSequence = D((CharSequence)localObject1);
      }
      label440:
      localObject1 = paramCharSequence;
      if (this.tEN) {
        localObject1 = A(paramCharSequence);
      }
      paramCharSequence = (CharSequence)localObject1;
      if (this.tEP) {
        paramCharSequence = B((CharSequence)localObject1);
      }
      if ((!this.tEQ) || (d.a.tDM == null)) {
        break label1092;
      }
      paramCharSequence = d.a.tDM.b(this.mContext, paramCharSequence, this.tES);
    }
    label777:
    label813:
    label818:
    label840:
    label1092:
    for (;;)
    {
      if (this.tEJ) {
        this.tEE.addAll(E(paramCharSequence));
      }
      if (this.tEG) {
        this.tEE.addAll(F(paramCharSequence));
      }
      if (this.tEH) {
        this.tEE.addAll(G(paramCharSequence));
      }
      if (this.tEM) {
        this.tEE.addAll(K(paramCharSequence));
      }
      if (this.tEK) {
        this.tEE.addAll(H(paramCharSequence));
      }
      if (this.tEI) {
        this.tEE.addAll(I(paramCharSequence));
      }
      if (this.tEL) {
        this.tEE.addAll(J(paramCharSequence));
      }
      if ((paramCharSequence instanceof Spannable)) {}
      Object localObject2;
      for (paramCharSequence = (SpannableString)paramCharSequence;; paramCharSequence = new SpannableString(paramCharSequence))
      {
        if (!this.tET) {
          break label840;
        }
        localObject1 = this.tED.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.tencent.mm.pluginsdk.ui.applet.k)((Iterator)localObject1).next();
          ((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).hNz = this.hNz;
          if ((((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).start <= paramCharSequence.length()) && (((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).end <= paramCharSequence.length())) {
            paramCharSequence.setSpan(new l(this.tER, (com.tencent.mm.pluginsdk.ui.applet.k)localObject2), ((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).start, ((com.tencent.mm.pluginsdk.ui.applet.k)localObject2).end, 33);
          }
        }
        this.tES = com.tencent.mm.br.a.V(this.mContext, a.c.aQF);
        break;
        if ((Build.VERSION.SDK_INT == 16) && (bg.aq(Build.MANUFACTURER, "").toLowerCase().indexOf("meizu".toLowerCase()) < 0))
        {
          paramInt = 1;
          break label337;
        }
        paramInt = 0;
        break label337;
        paramCharSequence = C((CharSequence)localObject1);
        break label440;
      }
      localObject1 = this.tEF.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.mm.pluginsdk.ui.applet.p)((Iterator)localObject1).next();
        if ((((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).start <= paramCharSequence.length()) && (((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).end <= paramCharSequence.length()))
        {
          Object localObject3 = this.mContext.getResources().getDrawable(((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).id);
          if ((((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).width > 0) && (((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).height > 0))
          {
            ((Drawable)localObject3).setBounds(0, 0, com.tencent.mm.br.a.fromDPToPix(this.mContext, ((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).width), com.tencent.mm.br.a.fromDPToPix(this.mContext, ((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).height));
            localObject3 = new e((Drawable)localObject3);
            ((e)localObject3).xpz = com.tencent.mm.br.a.fromDPToPix(this.mContext, 2);
            paramCharSequence.setSpan(localObject3, ((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).start, ((com.tencent.mm.pluginsdk.ui.applet.p)localObject2).start + 1, 18);
          }
          else
          {
            if (this.jU == null) {}
            for (paramInt = (int)(this.tES * 1.3F);; paramInt = (int)(this.jU.getTextSize() * 1.3F))
            {
              ((Drawable)localObject3).setBounds(0, 0, paramInt, paramInt);
              break;
            }
          }
        }
      }
      f(paramCharSequence);
      bNe();
      if (paramBoolean) {
        tEC.m(str, new SpannableString(paramCharSequence));
      }
      GMTrace.o(1215475744768L, 9056);
      return paramCharSequence;
    }
  }
  
  public final n j(TextView paramTextView)
  {
    GMTrace.i(1215341527040L, 9055);
    this.jU = paramTextView;
    if (paramTextView != null) {
      this.mContext = this.jU.getContext();
    }
    GMTrace.o(1215341527040L, 9055);
    return this;
  }
  
  final class a
  {
    int end;
    int start;
    
    a(int paramInt1, int paramInt2)
    {
      GMTrace.i(1203127713792L, 8964);
      this.start = paramInt1;
      this.end = paramInt2;
      GMTrace.o(1203127713792L, 8964);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */