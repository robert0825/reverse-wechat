package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ad.n;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.scanner.a.a.a;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h
  extends Preference
{
  public Context mContext;
  private View mView;
  List<a.a> nJb;
  
  public h(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6154017046528L, 45851);
    this.mView = null;
    this.mContext = null;
    this.nJb = null;
    this.mContext = paramContext;
    setLayoutResource(R.i.cDE);
    GMTrace.o(6154017046528L, 45851);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6154151264256L, 45852);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6154151264256L, 45852);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6154285481984L, 45853);
    super.onBindView(paramView);
    Object localObject = (GridView)this.mView.findViewById(R.h.bLR);
    paramView = new b();
    ((GridView)localObject).setAdapter(paramView);
    if (this.nJb != null)
    {
      localObject = this.nJb;
      paramView.owe.clear();
      paramView.owi.clear();
      paramView.owi = ((List)localObject);
      paramView.notifyDataSetChanged();
    }
    GMTrace.o(6154285481984L, 45853);
  }
  
  private static final class a
    implements i
  {
    private String mPicUrl;
    
    public a(String paramString)
    {
      GMTrace.i(6143145410560L, 45770);
      this.mPicUrl = null;
      this.mPicUrl = paramString;
      GMTrace.o(6143145410560L, 45770);
    }
    
    public final void I(String paramString, boolean paramBoolean)
    {
      GMTrace.i(6144353370112L, 45779);
      GMTrace.o(6144353370112L, 45779);
    }
    
    public final i.b Pl()
    {
      GMTrace.i(6144756023296L, 45782);
      GMTrace.o(6144756023296L, 45782);
      return null;
    }
    
    public final String Pm()
    {
      GMTrace.i(6143279628288L, 45771);
      String str = c.bcm().dv(this.mPicUrl, "@S");
      GMTrace.o(6143279628288L, 45771);
      return str;
    }
    
    public final String Pn()
    {
      GMTrace.i(6143413846016L, 45772);
      String str = this.mPicUrl;
      GMTrace.o(6143413846016L, 45772);
      return str;
    }
    
    public final String Po()
    {
      GMTrace.i(6143548063744L, 45773);
      String str = this.mPicUrl;
      GMTrace.o(6143548063744L, 45773);
      return str;
    }
    
    public final String Pp()
    {
      GMTrace.i(6143682281472L, 45774);
      String str = this.mPicUrl;
      GMTrace.o(6143682281472L, 45774);
      return str;
    }
    
    public final boolean Pq()
    {
      GMTrace.i(6143816499200L, 45775);
      GMTrace.o(6143816499200L, 45775);
      return false;
    }
    
    public final boolean Pr()
    {
      GMTrace.i(6143950716928L, 45776);
      GMTrace.o(6143950716928L, 45776);
      return false;
    }
    
    public final Bitmap Ps()
    {
      GMTrace.i(6144621805568L, 45781);
      if (ab.getContext() == null)
      {
        GMTrace.o(6144621805568L, 45781);
        return null;
      }
      Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
      GMTrace.o(6144621805568L, 45781);
      return localBitmap;
    }
    
    public final void Pt()
    {
      GMTrace.i(6144219152384L, 45778);
      GMTrace.o(6144219152384L, 45778);
    }
    
    public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
    {
      GMTrace.i(6144084934656L, 45777);
      if (i.a.hiU == parama) {}
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
        GMTrace.o(6144084934656L, 45777);
        return paramBitmap;
      }
      catch (IOException parama)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.ProductGridPreference", parama, "", new Object[0]);
        }
      }
    }
    
    public final void a(i.a parama, String paramString)
    {
      GMTrace.i(6144487587840L, 45780);
      GMTrace.o(6144487587840L, 45780);
    }
  }
  
  final class b
    extends BaseAdapter
    implements j.a
  {
    private LayoutInflater CJ;
    Map<String, WeakReference<ImageView>> owe;
    private int owh;
    List<a.a> owi;
    
    public b()
    {
      GMTrace.i(6086505529344L, 45348);
      this.owi = new ArrayList();
      this.owe = new HashMap();
      this.CJ = null;
      this.CJ = LayoutInflater.from(h.this.mContext);
      j.a(this);
      this.owh = h.this.mContext.getResources().getColor(R.e.aNV);
      GMTrace.o(6086505529344L, 45348);
    }
    
    public final int getCount()
    {
      GMTrace.i(6086639747072L, 45349);
      int i = this.owi.size();
      GMTrace.o(6086639747072L, 45349);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6086773964800L, 45350);
      Object localObject = this.owi.get(paramInt);
      GMTrace.o(6086773964800L, 45350);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6086908182528L, 45351);
      GMTrace.o(6086908182528L, 45351);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6087042400256L, 45352);
      final a.a locala;
      final Object localObject;
      if (paramView == null)
      {
        paramView = this.CJ.inflate(R.i.cDF, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.ouj = ((ImageView)paramView.findViewById(R.h.bFB));
        paramViewGroup.jXT = ((TextView)paramView.findViewById(R.h.bFA));
        paramView.setTag(paramViewGroup);
        locala = (a.a)this.owi.get(paramInt);
        localObject = j.a(new h.a(locala.iconUrl));
        if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
          break label226;
        }
        paramViewGroup.ouj.setImageBitmap((Bitmap)localObject);
        paramViewGroup.ouj.setBackgroundColor(0);
      }
      for (;;)
      {
        localObject = locala.osT;
        paramViewGroup.ouj.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6137776701440L, 45730);
            paramAnonymousView = new com.tencent.mm.plugin.scanner.a.h(localObject, locala.osS, locala.type, localObject, h.b.this.getCount(), locala.showType);
            at.wS().a(paramAnonymousView, 0);
            if (!bg.nm(localObject))
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("key_Product_ID", localObject);
              com.tencent.mm.bj.d.b(h.this.mContext, "scanner", ".ui.ProductUI", paramAnonymousView);
            }
            GMTrace.o(6137776701440L, 45730);
          }
        });
        paramViewGroup.ouj.setTag(locala.iconUrl);
        this.owe.put(locala.iconUrl, new WeakReference(paramViewGroup.ouj));
        paramViewGroup.jXT.setText(locala.name);
        GMTrace.o(6087042400256L, 45352);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label226:
        paramViewGroup.ouj.setBackgroundColor(this.owh);
        paramViewGroup.ouj.setImageBitmap(null);
      }
    }
    
    public final void k(String paramString, final Bitmap paramBitmap)
    {
      GMTrace.i(6087176617984L, 45353);
      if ((paramBitmap != null) && (!paramBitmap.isRecycled()) && (!bg.nm(paramString)))
      {
        w.v("MicroMsg.ProductGridPreference", "On get pic, notifyKey=" + paramString);
        if ((WeakReference)this.owe.get(paramString) != null)
        {
          final ImageView localImageView = (ImageView)((WeakReference)this.owe.get(paramString)).get();
          if ((localImageView != null) && (paramString.equals((String)localImageView.getTag()))) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6147574595584L, 45803);
                localImageView.setImageBitmap(paramBitmap);
                localImageView.setBackgroundColor(0);
                GMTrace.o(6147574595584L, 45803);
              }
            });
          }
        }
      }
      GMTrace.o(6087176617984L, 45353);
    }
    
    final class a
    {
      TextView jXT;
      ImageView ouj;
      
      a()
      {
        GMTrace.i(6158312013824L, 45883);
        GMTrace.o(6158312013824L, 45883);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */