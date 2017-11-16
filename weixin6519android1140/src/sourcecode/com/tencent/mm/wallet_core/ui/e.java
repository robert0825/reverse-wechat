package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.network.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.wallet_core.c.t;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class e
{
  private static SimpleDateFormat kdn;
  private static final String[] rlP;
  protected static final Pattern tDS;
  private static Typeface xES;
  
  static
  {
    GMTrace.i(1515586584576L, 11292);
    tDS = Pattern.compile("((?:(http|https|Http|Https):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?((?:(?:[a-zA-Z0-9][a-zA-Z0-9\\-\\_]{0,64}\\.)+(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnrwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eouw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agkmsyz]|v[aceginu]|w[fs]|y[etu]|z[amw]))|(?:(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");
    rlP = new String[] { "ABC_DEBIT", "ABC_CREDIT", "CITIC_CREDIT", "CMBC_DEBIT", "COMM_DEBIT", "HSBC_DEBIT" };
    kdn = null;
    GMTrace.o(1515586584576L, 11292);
  }
  
  public static String EO(int paramInt)
  {
    GMTrace.i(1510217875456L, 11252);
    if (kdn == null) {
      kdn = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    }
    String str = kdn.format(new Date(paramInt * 1000L));
    GMTrace.o(1510217875456L, 11252);
    return str;
  }
  
  public static String EP(int paramInt)
  {
    GMTrace.i(1510352093184L, 11253);
    String str = a(paramInt, new SimpleDateFormat("MM-dd HH:mm"), new SimpleDateFormat("yyyy-MM-dd HH:mm"));
    GMTrace.o(1510352093184L, 11253);
    return str;
  }
  
  public static void EQ(int paramInt)
  {
    GMTrace.i(1514378625024L, 11283);
    g.ork.i(12719, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1) });
    GMTrace.o(1514378625024L, 11283);
  }
  
  public static void P(Context paramContext, String paramString)
  {
    GMTrace.i(1511023181824L, 11258);
    if (TextUtils.isEmpty(paramString))
    {
      w.v("MicroMsg.WalletBaseUtil ", "username is null");
      GMTrace.o(1511023181824L, 11258);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramString);
    localIntent.putExtra("force_get_contact", true);
    d.a(paramContext, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", localIntent);
    GMTrace.o(1511023181824L, 11258);
  }
  
  public static void Q(Context paramContext, String paramString)
  {
    GMTrace.i(1510620528640L, 11255);
    if (TextUtils.isEmpty(paramString))
    {
      w.v("MicroMsg.WalletBaseUtil ", "username is null");
      GMTrace.o(1510620528640L, 11255);
      return;
    }
    if (s.fC(paramString))
    {
      bp(paramContext, paramString);
      GMTrace.o(1510620528640L, 11255);
      return;
    }
    P(paramContext, paramString);
    GMTrace.o(1510620528640L, 11255);
  }
  
  public static String XA(String paramString)
  {
    GMTrace.i(17611379179520L, 131215);
    if ((paramString != null) && (paramString.length() >= 2))
    {
      paramString = paramString.substring(paramString.length() - 1, paramString.length());
      paramString = "**" + paramString;
      GMTrace.o(17611379179520L, 131215);
      return paramString;
    }
    paramString = Xz(paramString);
    GMTrace.o(17611379179520L, 131215);
    return paramString;
  }
  
  public static String XB(String paramString)
  {
    GMTrace.i(1513304883200L, 11275);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(1513304883200L, 11275);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int k = paramString.length() / 4;
    int i = 0;
    while (i < k + 1)
    {
      int j = Math.min((i + 1) * 4, paramString.length());
      localStringBuilder.append(fu(paramString.substring(i * 4, j), ""));
      if (j - i * 4 == 4)
      {
        j = 0;
        while (j < 4)
        {
          localStringBuilder.append(" ");
          j += 1;
        }
      }
      i += 1;
    }
    paramString = localStringBuilder.toString();
    GMTrace.o(1513304883200L, 11275);
    return paramString;
  }
  
  public static String XC(String paramString)
  {
    GMTrace.i(1513439100928L, 11276);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(1513439100928L, 11276);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int m = paramString.length() / 4;
    int i = 0;
    while (i < m)
    {
      int k = Math.min((i + 1) * 4, paramString.length());
      int j = k;
      if (k + 4 > paramString.length()) {
        j = paramString.length();
      }
      localStringBuilder.append(fu(paramString.substring(i * 4, j), " "));
      if (j - i * 4 == 4)
      {
        j = 0;
        while (j < 6)
        {
          localStringBuilder.append(" ");
          j += 1;
        }
      }
      i += 1;
    }
    paramString = localStringBuilder.toString();
    GMTrace.o(1513439100928L, 11276);
    return paramString;
  }
  
  public static int XD(String paramString)
  {
    GMTrace.i(1514647060480L, 11285);
    if ("1".equals(paramString))
    {
      GMTrace.o(1514647060480L, 11285);
      return 0;
    }
    if ("2".equals(paramString))
    {
      GMTrace.o(1514647060480L, 11285);
      return 4;
    }
    if ("3".equals(paramString))
    {
      GMTrace.o(1514647060480L, 11285);
      return 12;
    }
    if ("4".equals(paramString))
    {
      GMTrace.o(1514647060480L, 11285);
      return 2;
    }
    if ("5".equals(paramString))
    {
      GMTrace.o(1514647060480L, 11285);
      return 8;
    }
    if ("6".equals(paramString))
    {
      GMTrace.o(1514647060480L, 11285);
      return 14;
    }
    if ("7".equals(paramString))
    {
      GMTrace.o(1514647060480L, 11285);
      return 16;
    }
    if ("8".equals(paramString))
    {
      GMTrace.o(1514647060480L, 11285);
      return 10;
    }
    GMTrace.o(1514647060480L, 11285);
    return -1;
  }
  
  public static String XE(String paramString)
  {
    GMTrace.i(1514915495936L, 11287);
    if (bg.nm(paramString))
    {
      GMTrace.o(1514915495936L, 11287);
      return paramString;
    }
    if (paramString.length() > 14)
    {
      paramString = paramString.substring(0, 14) + "...";
      GMTrace.o(1514915495936L, 11287);
      return paramString;
    }
    GMTrace.o(1514915495936L, 11287);
    return paramString;
  }
  
  public static String Xu(String paramString)
  {
    GMTrace.i(1509681004544L, 11248);
    if ("CNY".equals(paramString))
    {
      GMTrace.o(1509681004544L, 11248);
      return "¥";
    }
    if ("ZAR".equals(paramString))
    {
      GMTrace.o(1509681004544L, 11248);
      return "R";
    }
    if (("1".equals(paramString)) || (bg.nm(paramString)))
    {
      paramString = t.clX();
      GMTrace.o(1509681004544L, 11248);
      return paramString;
    }
    GMTrace.o(1509681004544L, 11248);
    return paramString;
  }
  
  public static String Xv(String paramString)
  {
    GMTrace.i(1510083657728L, 11251);
    if (("CNY".equals(paramString)) || ("1".equals(paramString)) || (bg.nm(paramString)))
    {
      GMTrace.o(1510083657728L, 11251);
      return "¥";
    }
    GMTrace.o(1510083657728L, 11251);
    return paramString;
  }
  
  public static boolean Xw(String paramString)
  {
    GMTrace.i(1511425835008L, 11261);
    if (!tDS.matcher(paramString).matches())
    {
      GMTrace.o(1511425835008L, 11261);
      return false;
    }
    GMTrace.o(1511425835008L, 11261);
    return true;
  }
  
  public static String Xx(String paramString)
  {
    GMTrace.i(1511560052736L, 11262);
    if (bg.nm(paramString))
    {
      GMTrace.o(1511560052736L, 11262);
      return paramString;
    }
    String str = "";
    int i = 0;
    while (i < paramString.length() - 1)
    {
      str = str + "*";
      i += 1;
    }
    paramString = str + paramString.substring(paramString.length() - 1, paramString.length());
    GMTrace.o(1511560052736L, 11262);
    return paramString;
  }
  
  public static String Xy(String paramString)
  {
    GMTrace.i(1511962705920L, 11265);
    if ((paramString != null) && (paramString.length() > 8))
    {
      int i = paramString.length();
      String str = paramString.substring(0, i - 8);
      paramString = paramString.substring(i - 4);
      paramString = str + "****" + paramString;
      GMTrace.o(1511962705920L, 11265);
      return paramString;
    }
    GMTrace.o(1511962705920L, 11265);
    return paramString;
  }
  
  public static String Xz(String paramString)
  {
    GMTrace.i(1512096923648L, 11266);
    if ((paramString != null) && (paramString.length() > 0))
    {
      String str = paramString.substring(1, paramString.length());
      w.d("MicroMsg.WalletBaseUtil ", "tail : " + str);
      paramString = paramString.substring(0, 1);
      w.d("MicroMsg.WalletBaseUtil ", "head : " + paramString);
      w.d("MicroMsg.WalletBaseUtil ", "after : " + paramString);
      paramString = "*" + str;
      GMTrace.o(1512096923648L, 11266);
      return paramString;
    }
    GMTrace.o(1512096923648L, 11266);
    return "";
  }
  
  public static String a(int paramInt, SimpleDateFormat paramSimpleDateFormat1, SimpleDateFormat paramSimpleDateFormat2)
  {
    GMTrace.i(1510486310912L, 11254);
    long l = paramInt * 1000L;
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    GregorianCalendar localGregorianCalendar2 = new GregorianCalendar();
    localGregorianCalendar2.setTimeInMillis(l);
    if (localGregorianCalendar1.get(1) == localGregorianCalendar2.get(1))
    {
      paramSimpleDateFormat1 = paramSimpleDateFormat1.format(new Date(l));
      GMTrace.o(1510486310912L, 11254);
      return paramSimpleDateFormat1;
    }
    paramSimpleDateFormat1 = paramSimpleDateFormat2.format(new Date(l));
    GMTrace.o(1510486310912L, 11254);
    return paramSimpleDateFormat1;
  }
  
  public static void a(int paramInt1, long paramLong, int paramInt2)
  {
    GMTrace.i(1514781278208L, 11286);
    g.ork.i(13375, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    GMTrace.o(1514781278208L, 11286);
  }
  
  public static void a(Context paramContext, final String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1512231141376L, 11267);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList1.add(paramContext.getString(a.i.tad));
    localLinkedList2.add(Integer.valueOf(0));
    if ((paramString1 != null) && (paramBoolean2))
    {
      localLinkedList1.add(paramContext.getString(a.i.tac));
      localLinkedList2.add(Integer.valueOf(1));
    }
    if ((paramBoolean1) && (!bg.nm(paramString2)))
    {
      localLinkedList1.add(paramContext.getString(a.i.tae, new Object[] { paramString2 }));
      localLinkedList2.add(Integer.valueOf(2));
      localLinkedList1.add(paramContext.getString(a.i.taf, new Object[] { paramString2 }));
      localLinkedList2.add(Integer.valueOf(3));
    }
    com.tencent.mm.ui.base.h.a(paramContext, "", localLinkedList1, localLinkedList2, "", new h.d()
    {
      public final void bT(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1462167928832L, 10894);
        Intent localIntent = new Intent();
        switch (paramAnonymousInt1)
        {
        }
        for (;;)
        {
          localIntent.putExtra("showShare", false);
          d.b(this.val$context, "webview", ".ui.tools.WebViewUI", localIntent);
          GMTrace.o(1462167928832L, 10894);
          return;
          localIntent.putExtra("rawUrl", this.val$context.getString(a.i.sYV, new Object[] { v.bPK() }));
          continue;
          if (paramString1 != null)
          {
            localIntent.putExtra("rawUrl", this.val$context.getString(a.i.sYU, new Object[] { v.bPK(), paramString1 }));
            continue;
            if (paramString1 != null)
            {
              localIntent.putExtra("rawUrl", this.val$context.getString(a.i.sYW, new Object[] { v.bPK(), paramString1 }));
              continue;
              if (paramString1 != null) {
                localIntent.putExtra("rawUrl", this.val$context.getString(a.i.sYX, new Object[] { v.bPK(), paramString1 }));
              }
            }
          }
        }
      }
    });
    GMTrace.o(1512231141376L, 11267);
  }
  
  public static void a(final TextView paramTextView, final String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(1514512842752L, 11284);
    if (paramTextView == null)
    {
      w.e("MicroMsg.WalletBaseUtil ", "hy: text view is null.");
      GMTrace.o(1514512842752L, 11284);
      return;
    }
    if (bg.nm(paramString2))
    {
      w.w("MicroMsg.WalletBaseUtil ", "hy: msg is null. set text view to gone");
      paramTextView.setVisibility(8);
      GMTrace.o(1514512842752L, 11284);
      return;
    }
    paramTextView.setVisibility(0);
    paramTextView.setText(paramString2);
    f.dX(XD(paramString1), 0);
    if (!bg.nm(paramString3)) {
      paramTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1478005620736L, 11012);
          w.i("MicroMsg.WalletBaseUtil ", "hy: on click banner");
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", this.val$url);
          paramAnonymousView.putExtra("showShare", false);
          d.b(paramTextView.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          f.dX(e.XD(paramString1), 1);
          GMTrace.o(1478005620736L, 11012);
        }
      });
    }
    GMTrace.o(1514512842752L, 11284);
  }
  
  public static void a(String paramString, final b paramb)
  {
    GMTrace.i(1513036447744L, 11273);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(new bf(new bf.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(1469818339328L, 10951);
        if ((paramAnonymouse == null) || (paramAnonymouse.DY() == null))
        {
          GMTrace.o(1469818339328L, 10951);
          return;
        }
        if (bg.nm(this.fSS))
        {
          w.w("MicroMsg.WalletBaseUtil ", "hy: key is null");
          GMTrace.o(1469818339328L, 10951);
          return;
        }
        try
        {
          paramAnonymouse = paramAnonymouse.DY().ii(this.fSS);
          if (paramb == null) {
            break label165;
          }
          if (paramAnonymouse != null)
          {
            paramb.bu(e.bv(paramAnonymouse));
            GMTrace.o(1469818339328L, 10951);
            return;
          }
        }
        catch (Exception paramAnonymouse)
        {
          w.e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", new Object[] { paramAnonymouse.toString() });
          if (paramb != null) {
            paramb.bu(null);
          }
          GMTrace.o(1469818339328L, 10951);
          return;
        }
        paramb.bu(null);
        label165:
        GMTrace.o(1469818339328L, 10951);
      }
    }), 0);
    GMTrace.o(1513036447744L, 11273);
  }
  
  public static void a(c... paramVarArgs)
  {
    GMTrace.i(1512902230016L, 11272);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(new bf(new bf.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(1481092628480L, 11035);
        if ((paramAnonymouse == null) || (paramAnonymouse.DY() == null))
        {
          GMTrace.o(1481092628480L, 11035);
          return;
        }
        if ((this.xEU == null) || (this.xEU.length == 0))
        {
          w.w("MicroMsg.WalletBaseUtil ", "hy: kvs is null or length is 0");
          GMTrace.o(1481092628480L, 11035);
          return;
        }
        try
        {
          e.c[] arrayOfc = this.xEU;
          int j = arrayOfc.length;
          int i = 0;
          while (i < j)
          {
            e.c localc = arrayOfc[i];
            if ((localc != null) && (!bg.nm(localc.amf))) {
              paramAnonymouse.DY().g(localc.amf, e.cc(localc.vku));
            }
            i += 1;
          }
          GMTrace.o(1481092628480L, 11035);
          return;
        }
        catch (Exception paramAnonymouse)
        {
          w.e("MicroMsg.WalletBaseUtil ", "hy: serialize failed: %s", new Object[] { paramAnonymouse.toString() });
          GMTrace.o(1481092628480L, 11035);
        }
      }
    }), 0);
    GMTrace.o(1512902230016L, 11272);
  }
  
  public static void a(String[] paramArrayOfString, final a parama)
  {
    GMTrace.i(1514244407296L, 11282);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(new bf(new bf.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(1461899493376L, 10892);
        if ((paramAnonymouse == null) || (paramAnonymouse.DY() == null))
        {
          GMTrace.o(1461899493376L, 10892);
          return;
        }
        if ((this.xEW == null) || (this.xEW.length == 0))
        {
          w.w("MicroMsg.WalletBaseUtil ", "hy: keys is null");
          GMTrace.o(1461899493376L, 10892);
          return;
        }
        HashMap localHashMap = new HashMap();
        int i = 0;
        for (;;)
        {
          try
          {
            if (i < this.xEW.length)
            {
              String str = this.xEW[i];
              if (!bg.nm(str))
              {
                byte[] arrayOfByte = paramAnonymouse.DY().ii(str);
                if (arrayOfByte != null) {
                  localHashMap.put(str, e.bv(arrayOfByte));
                }
              }
              else
              {
                w.e("MicroMsg.WalletBaseUtil ", "hy: key is null");
              }
            }
          }
          catch (Exception paramAnonymouse)
          {
            w.e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", new Object[] { paramAnonymouse.toString() });
            if (parama != null) {
              parama.K(null);
            }
            GMTrace.o(1461899493376L, 10892);
            return;
          }
          if (parama != null) {
            parama.K(localHashMap);
          }
          GMTrace.o(1461899493376L, 10892);
          return;
          i += 1;
        }
      }
    }), 0);
    GMTrace.o(1514244407296L, 11282);
  }
  
  public static void an(ArrayList<Bitmap> paramArrayList)
  {
    GMTrace.i(1513573318656L, 11277);
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      int i = paramArrayList.size() - 1;
      while (i > 0)
      {
        u((Bitmap)paramArrayList.remove(i));
        i -= 1;
      }
    }
    GMTrace.o(1513573318656L, 11277);
  }
  
  public static void bp(Context paramContext, String paramString)
  {
    GMTrace.i(1511291617280L, 11260);
    if (TextUtils.isEmpty(paramString))
    {
      w.v("MicroMsg.WalletBaseUtil ", "username is null");
      GMTrace.o(1511291617280L, 11260);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", paramString);
    localIntent.putExtra("finish_direct", true);
    d.a(paramContext, ".ui.chatting.En_5b8fbb1e", localIntent);
    GMTrace.o(1511291617280L, 11260);
  }
  
  public static void bq(Context paramContext, String paramString)
  {
    GMTrace.i(1512633794560L, 11270);
    if (bg.nm(paramString))
    {
      GMTrace.o(1512633794560L, 11270);
      return;
    }
    paramString = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + paramString));
    paramString.addFlags(268435456);
    paramContext.startActivity(paramString);
    GMTrace.o(1512633794560L, 11270);
  }
  
  public static void br(Context paramContext, String paramString)
  {
    GMTrace.i(19125892022272L, 142499);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("pay_channel", 1);
    d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    GMTrace.o(19125892022272L, 142499);
  }
  
  public static Object bv(byte[] paramArrayOfByte)
  {
    GMTrace.i(16013382909952L, 119309);
    paramArrayOfByte = new ObjectInputStream(new ByteArrayInputStream(paramArrayOfByte)).readObject();
    GMTrace.o(16013382909952L, 119309);
    return paramArrayOfByte;
  }
  
  public static Typeface cQ(Context paramContext)
  {
    GMTrace.i(1509144133632L, 11244);
    if (xES == null) {
      xES = Typeface.createFromAsset(paramContext.getAssets(), "fonts/WeChatNum.ttf");
    }
    paramContext = xES;
    GMTrace.o(1509144133632L, 11244);
    return paramContext;
  }
  
  public static byte[] cc(Object paramObject)
  {
    GMTrace.i(16013248692224L, 119308);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    new ObjectOutputStream(localByteArrayOutputStream).writeObject(paramObject);
    paramObject = localByteArrayOutputStream.toByteArray();
    GMTrace.o(16013248692224L, 119308);
    return (byte[])paramObject;
  }
  
  public static void cms()
  {
    GMTrace.i(1509412569088L, 11246);
    GMTrace.o(1509412569088L, 11246);
  }
  
  public static void cmt()
  {
    GMTrace.i(1513170665472L, 11274);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(new bf(new bf.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(1506996649984L, 11228);
        paramAnonymouse.Ea();
        GMTrace.o(1506996649984L, 11228);
      }
    }), 0);
    GMTrace.o(1513170665472L, 11274);
  }
  
  public static String d(double paramDouble, String paramString)
  {
    GMTrace.i(1509546786816L, 11247);
    if ("CNY".equals(paramString))
    {
      paramString = String.format("¥%.2f", new Object[] { Double.valueOf(paramDouble) });
      GMTrace.o(1509546786816L, 11247);
      return paramString;
    }
    if ("ZAR".equals(paramString))
    {
      paramString = String.format("R%.2f", new Object[] { Double.valueOf(paramDouble) });
      GMTrace.o(1509546786816L, 11247);
      return paramString;
    }
    if (("1".equals(paramString)) || (bg.nm(paramString)))
    {
      paramString = String.format(t.clX() + "%.2f", new Object[] { Double.valueOf(paramDouble) });
      GMTrace.o(1509546786816L, 11247);
      return paramString;
    }
    paramString = String.format(paramString + "%.2f", new Object[] { Double.valueOf(paramDouble) });
    GMTrace.o(1509546786816L, 11247);
    return paramString;
  }
  
  public static String dl(String paramString, int paramInt)
  {
    GMTrace.i(1515049713664L, 11288);
    if (bg.nm(paramString))
    {
      GMTrace.o(1515049713664L, 11288);
      return paramString;
    }
    if (paramString.length() > paramInt)
    {
      paramString = paramString.substring(0, paramInt) + "...";
      GMTrace.o(1515049713664L, 11288);
      return paramString;
    }
    GMTrace.o(1515049713664L, 11288);
    return paramString;
  }
  
  public static void e(MMActivity paramMMActivity, String paramString)
  {
    GMTrace.i(1512365359104L, 11268);
    Intent localIntent = new Intent();
    localIntent.putExtra("BaseScanUI_select_scan_mode", 7);
    localIntent.putExtra("bank_card_owner", paramString);
    d.b(paramMMActivity, "scanner", ".ui.BaseScanUI", localIntent);
    GMTrace.o(1512365359104L, 11268);
  }
  
  public static boolean f(JSONObject paramJSONObject, String paramString)
  {
    GMTrace.i(1511694270464L, 11263);
    boolean bool = "1".equals(paramJSONObject.optString(paramString, "0"));
    GMTrace.o(1511694270464L, 11263);
    return bool;
  }
  
  public static void fL(Context paramContext)
  {
    GMTrace.i(1511157399552L, 11259);
    if (paramContext == null)
    {
      w.e("MicroMsg.WalletBaseUtil ", "hy: jump to preference error. context is null");
      GMTrace.o(1511157399552L, 11259);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    localIntent.putExtra("preferred_tab", 3);
    d.a(paramContext, "com.tencent.mm.ui.LauncherUI", localIntent);
    GMTrace.o(1511157399552L, 11259);
  }
  
  public static String fs(String paramString)
  {
    GMTrace.i(1512499576832L, 11269);
    com.tencent.mm.kernel.h.xz();
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(paramString);
    if (localObject != null) {}
    for (localObject = ((com.tencent.mm.l.a)localObject).vk();; localObject = null)
    {
      if (bg.nm((String)localObject)) {}
      for (;;)
      {
        GMTrace.o(1512499576832L, 11269);
        return paramString;
        paramString = (String)localObject;
      }
    }
  }
  
  private static String fu(String paramString1, String paramString2)
  {
    GMTrace.i(1513975971840L, 11280);
    if (TextUtils.isEmpty(paramString1))
    {
      GMTrace.o(1513975971840L, 11280);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramString1.length())
    {
      localStringBuilder.append(paramString1.substring(i, i + 1));
      if (i != paramString1.length() - 1) {
        localStringBuilder.append(paramString2);
      }
      i += 1;
    }
    paramString1 = localStringBuilder.toString();
    GMTrace.o(1513975971840L, 11280);
    return paramString1;
  }
  
  public static String getUsername()
  {
    GMTrace.i(1511828488192L, 11264);
    com.tencent.mm.kernel.h.xw().wG();
    String str = q.zE();
    GMTrace.o(1511828488192L, 11264);
    return str;
  }
  
  public static void m(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(1510754746368L, 11256);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", paramBoolean);
    d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    GMTrace.o(1510754746368L, 11256);
  }
  
  public static void p(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(16864725958656L, 125652);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent, paramInt);
    GMTrace.o(16864725958656L, 125652);
  }
  
  public static String r(double paramDouble)
  {
    GMTrace.i(1509949440000L, 11250);
    String str = String.format("%.2f", new Object[] { Double.valueOf(paramDouble) });
    GMTrace.o(1509949440000L, 11250);
    return str;
  }
  
  public static String s(double paramDouble)
  {
    GMTrace.i(1509815222272L, 11249);
    String str = d(paramDouble, "");
    GMTrace.o(1509815222272L, 11249);
    return str;
  }
  
  public static void setNoSystemInputOnEditText(EditText paramEditText)
  {
    GMTrace.i(1509278351360L, 11245);
    if (Build.VERSION.SDK_INT < 11)
    {
      paramEditText.setInputType(0);
      GMTrace.o(1509278351360L, 11245);
      return;
    }
    try
    {
      Method localMethod1 = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
      localMethod1.setAccessible(false);
      localMethod1.invoke(paramEditText, new Object[] { Boolean.valueOf(false) });
      GMTrace.o(1509278351360L, 11245);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      w.e("erik", "setShowSoftInputOnFocus exception!");
      try
      {
        Method localMethod2 = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
        localMethod2.setAccessible(false);
        localMethod2.invoke(paramEditText, new Object[] { Boolean.valueOf(false) });
        GMTrace.o(1509278351360L, 11245);
        return;
      }
      catch (Exception localException)
      {
        paramEditText.setInputType(0);
        w.printErrStackTrace("MicroMsg.WalletBaseUtil ", localException, "", new Object[0]);
        GMTrace.o(1509278351360L, 11245);
        return;
      }
    }
    catch (Exception paramEditText)
    {
      w.printErrStackTrace("MicroMsg.WalletBaseUtil ", paramEditText, "", new Object[0]);
      GMTrace.o(1509278351360L, 11245);
    }
  }
  
  public static long t(double paramDouble)
  {
    GMTrace.i(1512768012288L, 11271);
    long l = Math.round(100.0D * paramDouble);
    GMTrace.o(1512768012288L, 11271);
    return l;
  }
  
  public static Bitmap t(Bitmap paramBitmap)
  {
    boolean bool = true;
    GMTrace.i(1513841754112L, 11279);
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    ((Matrix)localObject).setRotate(90.0F, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    localObject = new StringBuilder("resultBmp is null: ");
    if (paramBitmap == null) {}
    for (;;)
    {
      w.d("MicroMsg.WalletBaseUtil ", bool + "  degree:90.0");
      GMTrace.o(1513841754112L, 11279);
      return paramBitmap;
      bool = false;
    }
  }
  
  public static void u(Bitmap paramBitmap)
  {
    GMTrace.i(1513707536384L, 11278);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled())) {
      paramBitmap.recycle();
    }
    GMTrace.o(1513707536384L, 11278);
  }
  
  public static abstract interface a
  {
    public abstract void K(Map<String, Object> paramMap);
  }
  
  public static abstract interface b
  {
    public abstract void bu(Object paramObject);
  }
  
  public static final class c
  {
    public String amf;
    public Object vku;
    
    public c()
    {
      GMTrace.i(1462570582016L, 10897);
      this.amf = null;
      this.vku = null;
      GMTrace.o(1462570582016L, 10897);
    }
    
    public c(String paramString, Object paramObject)
    {
      GMTrace.i(1462704799744L, 10898);
      this.amf = null;
      this.vku = null;
      this.amf = paramString;
      this.vku = paramObject;
      GMTrace.o(1462704799744L, 10898);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */