package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.b.a.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.compatible.f.a;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.protocal.c.baa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.AuthorizeItemListView;
import java.util.ArrayList;
import java.util.LinkedList;

public final class h
{
  private Context context;
  public AuthorizeItemListView iIW;
  private LinearLayout iIY;
  private String ibs;
  private String mAppName;
  private b rVQ;
  
  public h(Context paramContext)
  {
    GMTrace.i(12069797625856L, 89927);
    this.mAppName = "";
    this.context = paramContext;
    GMTrace.o(12069797625856L, 89927);
  }
  
  private boolean a(String paramString, final LinkedList<baa> paramLinkedList, final a parama)
  {
    GMTrace.i(18165027307520L, 135340);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.e("MicroMsg.AppBrandAuthorizeDialog", "scopeInfoList is empty or null");
      GMTrace.o(18165027307520L, 135340);
      return false;
    }
    final com.tencent.mm.ui.base.k localk = new com.tencent.mm.ui.base.k(this.context, R.m.emg);
    LinearLayout localLinearLayout = (LinearLayout)((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(R.i.cpx, null);
    Object localObject = (TextView)localLinearLayout.findViewById(R.h.cof);
    if (!bg.nm(paramString)) {
      ((TextView)localObject).setText(paramString);
    }
    paramString = (ImageView)localLinearLayout.findViewById(R.h.ben);
    localObject = a.decodeResource(ab.getResources(), R.k.aVS);
    localObject = android.support.v4.b.a.k.a(ab.getResources(), (Bitmap)localObject);
    ((i)localObject).bt();
    if (paramString != null) {
      b.CT().a(paramString, this.ibs, (Drawable)localObject, e.grO);
    }
    paramString = (TextView)localLinearLayout.findViewById(R.h.bes);
    if (this.mAppName == null) {
      this.mAppName = "";
    }
    paramString.setText(this.context.getString(R.l.dGU, new Object[] { this.mAppName }));
    this.iIW = ((AuthorizeItemListView)localLinearLayout.findViewById(R.h.bfd));
    this.rVQ = new b(paramLinkedList);
    this.iIW.setAdapter(this.rVQ);
    if (paramLinkedList.size() > 5)
    {
      this.iIW.Ob = paramLinkedList.size();
      this.iIY = ((LinearLayout)localLinearLayout.findViewById(R.h.bfe));
      paramString = (LinearLayout.LayoutParams)this.iIY.getLayoutParams();
      paramString.height = this.context.getResources().getDimensionPixelSize(R.f.aSy);
      this.iIY.setLayoutParams(paramString);
    }
    ((Button)localLinearLayout.findViewById(R.h.bLo)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12094359470080L, 90110);
        paramAnonymousView = new ArrayList();
        int i = 0;
        while (i < paramLinkedList.size())
        {
          if ((((baa)paramLinkedList.get(i)).uOa == 2) || (((baa)paramLinkedList.get(i)).uOa == 3)) {
            paramAnonymousView.add(((baa)paramLinkedList.get(i)).tWJ);
          }
          i += 1;
        }
        w.d("MicroMsg.AppBrandAuthorizeDialog", "stev acceptButton click!");
        Bundle localBundle = new Bundle();
        localBundle.putSerializable("key_scope", paramAnonymousView);
        parama.c(1, localBundle);
        localk.dismiss();
        GMTrace.o(12094359470080L, 90110);
      }
    });
    ((Button)localLinearLayout.findViewById(R.h.bLw)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12094896340992L, 90114);
        paramAnonymousView = new ArrayList();
        int i = 0;
        while (i < paramLinkedList.size())
        {
          if ((((baa)paramLinkedList.get(i)).uOa == 2) || (((baa)paramLinkedList.get(i)).uOa == 3)) {
            paramAnonymousView.add(((baa)paramLinkedList.get(i)).tWJ);
          }
          i += 1;
        }
        w.d("MicroMsg.AppBrandAuthorizeDialog", "stev rejectButton click!");
        Bundle localBundle = new Bundle();
        localBundle.putSerializable("key_scope", paramAnonymousView);
        parama.c(2, localBundle);
        localk.dismiss();
        GMTrace.o(12094896340992L, 90114);
      }
    });
    localk.setCanceledOnTouchOutside(false);
    localk.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12095970082816L, 90122);
        if (h.this.iIW != null) {
          h.this.iIW.setAdapter(null);
        }
        GMTrace.o(12095970082816L, 90122);
      }
    });
    localk.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12097849131008L, 90136);
        w.d("MicroMsg.AppBrandAuthorizeDialog", "stev dialog onCancel");
        parama.c(3, null);
        GMTrace.o(12097849131008L, 90136);
      }
    });
    localk.setContentView(localLinearLayout);
    try
    {
      localk.show();
      GMTrace.o(18165027307520L, 135340);
      return true;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.AppBrandAuthorizeDialog", "dialog show failed %s", new Object[] { paramString.getMessage() });
      GMTrace.o(18165027307520L, 135340);
    }
    return false;
  }
  
  public final boolean a(LinkedList<baa> paramLinkedList, String paramString1, String paramString2, a parama)
  {
    GMTrace.i(12069931843584L, 89928);
    boolean bool = a(paramLinkedList, paramString1, paramString2, null, parama);
    GMTrace.o(12069931843584L, 89928);
    return bool;
  }
  
  public final boolean a(LinkedList<baa> paramLinkedList, String paramString1, String paramString2, String paramString3, a parama)
  {
    GMTrace.i(18164893089792L, 135339);
    w.d("MicroMsg.AppBrandAuthorizeDialog", "stev AppBrandAuthorizeDialog showAlert!");
    this.mAppName = paramString1;
    this.ibs = paramString2;
    boolean bool = a(paramString3, paramLinkedList, parama);
    GMTrace.o(18164893089792L, 135339);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void c(int paramInt, Bundle paramBundle);
  }
  
  private final class b
    extends BaseAdapter
  {
    private LinkedList<baa> iJc;
    
    public b()
    {
      GMTrace.i(12070200279040L, 89930);
      LinkedList localLinkedList;
      this.iJc = localLinkedList;
      GMTrace.o(12070200279040L, 89930);
    }
    
    private baa jQ(int paramInt)
    {
      GMTrace.i(12070468714496L, 89932);
      baa localbaa = (baa)this.iJc.get(paramInt);
      GMTrace.o(12070468714496L, 89932);
      return localbaa;
    }
    
    public final int getCount()
    {
      GMTrace.i(12070334496768L, 89931);
      if (this.iJc == null)
      {
        GMTrace.o(12070334496768L, 89931);
        return 0;
      }
      int i = this.iJc.size();
      GMTrace.o(12070334496768L, 89931);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(12070602932224L, 89933);
      long l = paramInt;
      GMTrace.o(12070602932224L, 89933);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(12070737149952L, 89934);
      if ((this.iJc == null) || (this.iJc.size() <= 0))
      {
        GMTrace.o(12070737149952L, 89934);
        return null;
      }
      final baa localbaa = jQ(paramInt);
      final Object localObject;
      if (paramView == null)
      {
        paramView = new a();
        localObject = View.inflate(paramViewGroup.getContext(), R.i.cpy, null);
        paramView.iJg = ((ImageView)((View)localObject).findViewById(R.h.bed));
        paramView.iJh = ((TextView)((View)localObject).findViewById(R.h.bec));
        ((View)localObject).setTag(paramView);
        paramViewGroup = paramView;
        paramView = (View)localObject;
        if (localbaa.uOa != 1) {
          break label186;
        }
        paramViewGroup.iJg.setImageResource(R.k.cMV);
      }
      for (;;)
      {
        paramViewGroup.iJh.setText(localbaa.lPj);
        localObject = paramViewGroup.iJg;
        paramViewGroup.iJg.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(12089124978688L, 90071);
            if (localbaa.uOa == 2)
            {
              localObject.setImageResource(R.k.cMV);
              localbaa.uOa = 1;
              GMTrace.o(12089124978688L, 90071);
              return;
            }
            if (localbaa.uOa == 1)
            {
              localObject.setImageResource(R.k.cMT);
              localbaa.uOa = 2;
            }
            GMTrace.o(12089124978688L, 90071);
          }
        });
        GMTrace.o(12070737149952L, 89934);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label186:
        if (localbaa.uOa == 3) {
          paramViewGroup.iJg.setImageResource(R.k.cMU);
        } else {
          paramViewGroup.iJg.setImageResource(R.k.cMT);
        }
      }
    }
    
    private final class a
    {
      ImageView iJg;
      TextView iJh;
      
      public a()
      {
        GMTrace.i(12060402384896L, 89857);
        GMTrace.o(12060402384896L, 89857);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */