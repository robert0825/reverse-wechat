package com.tencent.mm.plugin.readerapp.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.readerapp.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.bh;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public class ReaderItemListView
  extends ListView
{
  private Context context;
  private LayoutInflater lVD;
  p.d mTX;
  List<bh> ods;
  a odt;
  View.OnCreateContextMenuListener odu;
  private DisplayMetrics odv;
  int position;
  int type;
  
  public ReaderItemListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11762439028736L, 87637);
    this.position = 0;
    this.type = 0;
    this.ods = new ArrayList();
    init(paramContext);
    GMTrace.o(11762439028736L, 87637);
  }
  
  public ReaderItemListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11762304811008L, 87636);
    this.position = 0;
    this.type = 0;
    this.ods = new ArrayList();
    init(paramContext);
    GMTrace.o(11762304811008L, 87636);
  }
  
  private void init(Context paramContext)
  {
    boolean bool = false;
    GMTrace.i(11762573246464L, 87638);
    this.context = paramContext;
    this.lVD = v.fb(paramContext);
    this.type = ((Activity)paramContext).getIntent().getIntExtra("type", 0);
    if (bh.fw(this.type) != null) {
      bool = true;
    }
    Assert.assertTrue(bool);
    this.odv = getResources().getDisplayMetrics();
    this.odt = new a();
    setAdapter(this.odt);
    GMTrace.o(11762573246464L, 87638);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11762707464192L, 87639);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(11762707464192L, 87639);
  }
  
  final class a
    extends BaseAdapter
  {
    a()
    {
      GMTrace.i(11765660254208L, 87661);
      GMTrace.o(11765660254208L, 87661);
    }
    
    public final int getCount()
    {
      GMTrace.i(11765794471936L, 87662);
      int i = ReaderItemListView.a(ReaderItemListView.this).size();
      GMTrace.o(11765794471936L, 87662);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(11765928689664L, 87663);
      Object localObject = ReaderItemListView.a(ReaderItemListView.this).get(paramInt);
      GMTrace.o(11765928689664L, 87663);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11766062907392L, 87664);
      GMTrace.o(11766062907392L, 87664);
      return 0L;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(11766197125120L, 87665);
      if (((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).type == 20)
      {
        if (paramInt == 0)
        {
          String str1 = ((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).Bz();
          String str2 = ((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).BA();
          if (bg.nm(str1))
          {
            if (bg.nm(str2))
            {
              GMTrace.o(11766197125120L, 87665);
              return 1;
            }
            GMTrace.o(11766197125120L, 87665);
            return 2;
          }
          if (bg.nm(str2))
          {
            GMTrace.o(11766197125120L, 87665);
            return 3;
          }
          GMTrace.o(11766197125120L, 87665);
          return 0;
        }
        GMTrace.o(11766197125120L, 87665);
        return 1;
      }
      if (paramInt == 0)
      {
        if (getCount() == 1)
        {
          GMTrace.o(11766197125120L, 87665);
          return 8;
        }
        GMTrace.o(11766197125120L, 87665);
        return 6;
      }
      if (paramInt == getCount() - 1)
      {
        GMTrace.o(11766197125120L, 87665);
        return 7;
      }
      GMTrace.o(11766197125120L, 87665);
      return 5;
    }
    
    public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool2 = true;
      paramViewGroup = null;
      GMTrace.i(11766465560576L, 87667);
      int i = getItemViewType(paramInt);
      boolean bool1;
      if (paramView == null) {
        switch (i)
        {
        default: 
          if (paramViewGroup != null)
          {
            bool1 = true;
            label83:
            Assert.assertTrue(bool1);
            if (paramViewGroup.ikm == null) {
              break label1261;
            }
            bool1 = bool2;
            label99:
            Assert.assertTrue(bool1);
            paramViewGroup.ikm.setText(((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).getTitle().trim());
            if (paramViewGroup.odz != null) {
              paramViewGroup.odz.setText(((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).BA().trim());
            }
            if (paramViewGroup.iCs != null) {
              paramViewGroup.iCs.setText(((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).Bx().trim() + ReaderItemListView.this.getContext().getString(R.l.dPN));
            }
            Bitmap localBitmap;
            if (paramViewGroup.iCr != null)
            {
              localBitmap = j.a(new s(((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).By(), ((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).type, "@S", false));
              if (localBitmap == null) {
                break label1267;
              }
              paramViewGroup.iCr.setImageBitmap(localBitmap);
              paramViewGroup.iCr.setVisibility(0);
              paramViewGroup.odA.setVisibility(8);
            }
            label325:
            if (paramViewGroup.odf != null)
            {
              localBitmap = j.a(new s(((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).Bz(), ((bh)ReaderItemListView.a(ReaderItemListView.this).get(paramInt)).type, "@T", false));
              if (localBitmap == null) {
                break label1287;
              }
              paramViewGroup.odf.setImageBitmap(localBitmap);
              paramViewGroup.odf.setVisibility(0);
              paramViewGroup.jeL.setVisibility(8);
            }
          }
          break;
        }
      }
      for (;;)
      {
        if ((paramViewGroup.odk != null) && (ReaderItemListView.c(ReaderItemListView.this) != null))
        {
          paramViewGroup.odk.setTag(Integer.valueOf(ReaderItemListView.d(ReaderItemListView.this)));
          paramViewGroup.odk.setOnLongClickListener(new View.OnLongClickListener()
          {
            public final boolean onLongClick(View paramAnonymousView)
            {
              GMTrace.i(11758412496896L, 87607);
              new l(ReaderItemListView.this.getContext()).b(paramAnonymousView, ReaderItemListView.c(ReaderItemListView.this), ReaderItemListView.e(ReaderItemListView.this));
              GMTrace.o(11758412496896L, 87607);
              return true;
            }
          });
          paramViewGroup.odk.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(11754788618240L, 87580);
              int i = paramInt;
              Intent localIntent = new Intent();
              localIntent.putExtra("mode", 1);
              paramAnonymousView = ((bh)ReaderItemListView.a(ReaderItemListView.this).get(i)).getUrl();
              if (paramAnonymousView.contains("?"))
              {
                paramAnonymousView = paramAnonymousView + "&dt=2&cv=0x" + Integer.toHexString(d.tJC) + "&w=" + ReaderItemListView.f(ReaderItemListView.this).widthPixels;
                localIntent.putExtra("rawUrl", paramAnonymousView);
                localIntent.putExtra("webpageTitle", ((bh)ReaderItemListView.a(ReaderItemListView.this).get(i)).getTitle());
                localIntent.putExtra("title", ReaderItemListView.g(ReaderItemListView.this).getString(R.l.dCu));
                localIntent.putExtra("useJs", true);
                localIntent.putExtra("vertical_scroll", true);
                paramAnonymousView = new Bundle();
                if (((bh)ReaderItemListView.a(ReaderItemListView.this).get(i)).type != 20) {
                  break label414;
                }
                paramAnonymousView.putInt("snsWebSource", 3);
              }
              for (;;)
              {
                localIntent.putExtra("jsapiargs", paramAnonymousView);
                localIntent.putExtra("shortUrl", ((bh)ReaderItemListView.a(ReaderItemListView.this).get(i)).Bw());
                localIntent.putExtra("type", ((bh)ReaderItemListView.a(ReaderItemListView.this).get(i)).type);
                localIntent.putExtra("tweetid", ((bh)ReaderItemListView.a(ReaderItemListView.this).get(i)).Bv());
                localIntent.putExtra("geta8key_username", "blogapp");
                a.hnH.j(localIntent, ReaderItemListView.g(ReaderItemListView.this));
                GMTrace.o(11754788618240L, 87580);
                return;
                paramAnonymousView = paramAnonymousView + "?dt=2&cv=0x" + Integer.toHexString(d.tJC) + "&w=" + ReaderItemListView.f(ReaderItemListView.this).widthPixels;
                break;
                label414:
                paramAnonymousView.putInt("snsWebSource", 2);
              }
            }
          });
        }
        GMTrace.o(11766465560576L, 87667);
        return paramView;
        paramViewGroup = new a();
        paramView = ReaderItemListView.b(ReaderItemListView.this).inflate(R.i.cEi, null);
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWF));
        paramView.setTag(paramViewGroup);
        break;
        paramViewGroup = new a();
        paramView = ReaderItemListView.b(ReaderItemListView.this).inflate(R.i.cEg, null);
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWD));
        paramViewGroup.odz = ((TextView)paramView.findViewById(R.h.bWz));
        paramView.setTag(paramViewGroup);
        break;
        paramViewGroup = new a();
        paramView = ReaderItemListView.b(ReaderItemListView.this).inflate(R.i.cEf, null);
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWD));
        paramViewGroup.odf = ((ImageView)paramView.findViewById(R.h.bWx));
        paramViewGroup.jeL = ((ProgressBar)paramView.findViewById(R.h.bWy));
        paramView.setTag(paramViewGroup);
        break;
        paramViewGroup = new a();
        paramView = ReaderItemListView.b(ReaderItemListView.this).inflate(R.i.cEl, null);
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWD));
        paramViewGroup.odf = ((ImageView)paramView.findViewById(R.h.bWx));
        paramViewGroup.jeL = ((ProgressBar)paramView.findViewById(R.h.bWy));
        paramViewGroup.iCs = ((TextView)paramView.findViewById(R.h.bWC));
        paramViewGroup.iCr = ((ImageView)paramView.findViewById(R.h.bWA));
        paramViewGroup.odA = ((ProgressBar)paramView.findViewById(R.h.bWB));
        paramViewGroup.odk = paramView.findViewById(R.h.bWw);
        paramViewGroup.odk.setBackgroundResource(R.g.aZq);
        paramView.setTag(paramViewGroup);
        break;
        paramViewGroup = new a();
        paramView = ReaderItemListView.b(ReaderItemListView.this).inflate(R.i.cEm, null);
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWD));
        paramViewGroup.iCs = ((TextView)paramView.findViewById(R.h.bWC));
        paramViewGroup.iCr = ((ImageView)paramView.findViewById(R.h.bWA));
        paramViewGroup.odA = ((ProgressBar)paramView.findViewById(R.h.bWB));
        paramViewGroup.odk = paramView.findViewById(R.h.bWw);
        paramViewGroup.odk.setBackgroundResource(R.g.aZr);
        paramView.setTag(paramViewGroup);
        break;
        paramViewGroup = new a();
        paramView = ReaderItemListView.b(ReaderItemListView.this).inflate(R.i.cEo, null);
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWD));
        paramViewGroup.iCs = ((TextView)paramView.findViewById(R.h.bWC));
        paramViewGroup.iCr = ((ImageView)paramView.findViewById(R.h.bWA));
        paramViewGroup.odA = ((ProgressBar)paramView.findViewById(R.h.bWB));
        paramViewGroup.odk = paramView.findViewById(R.h.bWw);
        paramViewGroup.odk.setBackgroundResource(R.g.aZq);
        paramView.setTag(paramViewGroup);
        break;
        paramViewGroup = new a();
        paramView = ReaderItemListView.b(ReaderItemListView.this).inflate(R.i.cEm, null);
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWD));
        paramViewGroup.iCs = ((TextView)paramView.findViewById(R.h.bWC));
        paramViewGroup.iCr = ((ImageView)paramView.findViewById(R.h.bWA));
        paramViewGroup.odA = ((ProgressBar)paramView.findViewById(R.h.bWB));
        paramViewGroup.odk = paramView.findViewById(R.h.bWw);
        paramViewGroup.odk.setBackgroundResource(R.g.aZs);
        paramView.setTag(paramViewGroup);
        break;
        paramViewGroup = new a();
        paramView = ReaderItemListView.b(ReaderItemListView.this).inflate(R.i.cEn, null);
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWD));
        paramViewGroup.iCs = ((TextView)paramView.findViewById(R.h.bWC));
        paramViewGroup.iCr = ((ImageView)paramView.findViewById(R.h.bWA));
        paramViewGroup.odA = ((ProgressBar)paramView.findViewById(R.h.bWB));
        paramViewGroup.odk = paramView.findViewById(R.h.bWw);
        paramViewGroup.odk.setBackgroundResource(R.g.aZp);
        paramView.setTag(paramViewGroup);
        break;
        paramViewGroup = (a)paramView.getTag();
        break;
        bool1 = false;
        break label83;
        label1261:
        bool1 = false;
        break label99;
        label1267:
        paramViewGroup.odA.setVisibility(0);
        paramViewGroup.iCr.setVisibility(8);
        break label325;
        label1287:
        paramViewGroup.jeL.setVisibility(0);
        paramViewGroup.odf.setVisibility(8);
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(11766331342848L, 87666);
      GMTrace.o(11766331342848L, 87666);
      return 9;
    }
    
    final class a
    {
      ImageView iCr;
      TextView iCs;
      TextView ikm;
      ProgressBar jeL;
      ProgressBar odA;
      ImageView odf;
      View odk;
      TextView odz;
      
      a()
      {
        GMTrace.i(11758009843712L, 87604);
        GMTrace.o(11758009843712L, 87604);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\ui\ReaderItemListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */