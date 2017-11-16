package com.tencent.mm.plugin.fts.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.b.a;
import com.tencent.mm.plugin.fts.d.b.a.a;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static CharSequence a(Context paramContext, List<com.tencent.mm.plugin.fts.a.a.d> paramList, String[] paramArrayOfString, List<String> paramList1, TextPaint paramTextPaint, String paramString)
  {
    GMTrace.i(18562580217856L, 138302);
    Arrays.sort(paramArrayOfString, new Comparator() {});
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i = 0;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (i < paramList.size())
    {
      localObject1 = (com.tencent.mm.plugin.fts.a.a.d)paramList.get(i);
      if (((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwI < paramArrayOfString.length)
      {
        localObject2 = paramArrayOfString[localObject1.lwI];
        if (!bg.nm((String)localObject2))
        {
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject2);
          if (localObject2 != null)
          {
            localObject3 = ((af)localObject2).field_username;
            localObject4 = s.a((x)localObject2, (String)localObject3);
            switch (((com.tencent.mm.plugin.fts.a.a.d)localObject1).gRk)
            {
            }
          }
        }
      }
      for (;;)
      {
        if ((!bg.nm(((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwK)) && (((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwK.contains(paramString))) {
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwM += 10;
        }
        i += 1;
        break;
        ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwK = com.tencent.mm.plugin.fts.a.d.cm((String)localObject3, ((x)localObject2).qQ());
        ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwL = ((String)localObject4);
        continue;
        ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwO = true;
        ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwN = true;
        ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwK = ((af)localObject2).field_nickname;
        if (!((af)localObject2).field_nickname.equals(localObject4))
        {
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwL = ((String)localObject4);
          continue;
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwO = true;
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwN = true;
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwK = ((String)localObject4);
          continue;
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwK = ((com.tencent.mm.plugin.fts.a.a.d)localObject1).content;
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwL = ((String)localObject4);
          continue;
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwK = ((af)localObject2).fjt;
          ((com.tencent.mm.plugin.fts.a.a.d)localObject1).lwL = ((String)localObject4);
        }
      }
    }
    Collections.sort(paramList, new Comparator() {});
    i = 0;
    if ((i < paramList.size()) && (i < paramList1.size()))
    {
      paramArrayOfString = (com.tencent.mm.plugin.fts.a.a.d)paramList.get(i);
      localObject1 = com.tencent.mm.pluginsdk.ui.d.h.b(paramContext, paramArrayOfString.lwK, paramTextPaint.getTextSize());
      if (localSpannableStringBuilder.length() > 0) {
        localSpannableStringBuilder.append(", ");
      }
      localObject2 = f.a(a.a((CharSequence)localObject1, paramString, paramList1, paramArrayOfString.lwN, paramArrayOfString.lwO, f.a.lzA - 100, paramTextPaint));
      if (bg.nm(paramArrayOfString.lwL))
      {
        localObject3 = new a();
        ((a)localObject3).lAw = ((CharSequence)localObject1);
        ((a)localObject3).lAz = ((List)localObject2);
        ((a)localObject3).lwN = paramArrayOfString.lwN;
        ((a)localObject3).lAy = paramArrayOfString.lwO;
        ((a)localObject3).lAC = (f.a.lzA - 100);
        ((a)localObject3).gbA = paramTextPaint;
        localSpannableStringBuilder.append(f.b((a)localObject3).lAJ);
      }
      for (;;)
      {
        i += 1;
        break;
        localObject3 = TextUtils.concat(new CharSequence[] { com.tencent.mm.pluginsdk.ui.d.h.b(paramContext, paramArrayOfString.lwL, paramTextPaint.getTextSize()), "(" });
        int j = ((CharSequence)localObject3).length();
        localObject4 = ((List)localObject2).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          a.a locala = (a.a)((Iterator)localObject4).next();
          locala.lAD += j;
          locala.lAE += j;
        }
        localObject4 = new a();
        ((a)localObject4).lAw = TextUtils.concat(new CharSequence[] { localObject3, localObject1, ")" });
        ((a)localObject4).lAz = ((List)localObject2);
        ((a)localObject4).lwN = paramArrayOfString.lwN;
        ((a)localObject4).lAy = paramArrayOfString.lwO;
        ((a)localObject4).lAC = (f.a.lzA - 100);
        ((a)localObject4).gbA = paramTextPaint;
        localSpannableStringBuilder.append(f.b((a)localObject4).lAJ);
      }
    }
    GMTrace.o(18562580217856L, 138302);
    return localSpannableStringBuilder;
  }
  
  public static void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(18562043346944L, 138298);
    a(paramContext, paramImageView, paramString1, paramString2, paramInt, true, 0, 0);
    GMTrace.o(18562043346944L, 138298);
  }
  
  public static void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(18562177564672L, 138299);
    a(paramContext, paramImageView, paramString1, paramString2, paramInt1, false, paramInt2, paramInt3);
    GMTrace.o(18562177564672L, 138299);
  }
  
  private static void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    GMTrace.i(18562311782400L, 138300);
    h.aCF().a(paramImageView, paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
    if ((!bg.nm(paramString1)) || (!bg.nm(paramString2)))
    {
      Bitmap localBitmap = h.aCF().a(paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        g.a.a(paramContext.getResources(), localBitmap, paramImageView);
        paramImageView.setVisibility(0);
        GMTrace.o(18562311782400L, 138300);
        return;
      }
      if (paramInt1 > 0) {
        paramImageView.setImageResource(paramInt1);
      }
      for (;;)
      {
        h.aCF().a(paramContext, paramImageView, paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
        break;
        paramImageView.setImageResource(j.a.transparent);
      }
    }
    if ((paramInt1 > 0) && ((!bg.nm(paramString1)) || (!bg.nm(paramString2))))
    {
      paramImageView.setImageResource(paramInt1);
      GMTrace.o(18562311782400L, 138300);
      return;
    }
    paramImageView.setVisibility(8);
    GMTrace.o(18562311782400L, 138300);
  }
  
  public static boolean a(CharSequence paramCharSequence, TextView paramTextView)
  {
    GMTrace.i(16711986184192L, 124514);
    if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
    {
      paramTextView.setText(paramCharSequence, TextView.BufferType.SPANNABLE);
      paramTextView.setVisibility(0);
      GMTrace.o(16711986184192L, 124514);
      return true;
    }
    paramTextView.setVisibility(8);
    GMTrace.o(16711986184192L, 124514);
    return false;
  }
  
  public static boolean a(String paramString, TextView paramTextView)
  {
    GMTrace.i(16712120401920L, 124515);
    if ((paramString != null) && (paramString.length() != 0))
    {
      paramTextView.setText(paramString);
      paramTextView.setVisibility(0);
      GMTrace.o(16712120401920L, 124515);
      return true;
    }
    paramTextView.setVisibility(8);
    GMTrace.o(16712120401920L, 124515);
    return false;
  }
  
  public static String oc(int paramInt)
  {
    GMTrace.i(18562446000128L, 138301);
    int j = 0;
    int i = j;
    switch (paramInt)
    {
    default: 
      i = j;
    }
    while (i == 0)
    {
      GMTrace.o(18562446000128L, 138301);
      return null;
      i = j.g.lzS;
      continue;
      i = j.g.lzM;
      continue;
      i = j.g.lzQ;
      continue;
      i = j.g.dyp;
      continue;
      i = j.g.dyq;
      continue;
      i = j.g.lzP;
      continue;
      i = j.g.lzN;
      continue;
      i = j.g.lzO;
      continue;
      i = j.g.lzR;
      continue;
      i = j.g.lzT;
    }
    String str = ab.getContext().getString(i);
    GMTrace.o(18562446000128L, 138301);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */