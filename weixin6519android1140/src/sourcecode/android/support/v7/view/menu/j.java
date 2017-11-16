package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.c.a.b;
import android.support.v4.view.d.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
final class j
  extends i
{
  j(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  final i.a a(ActionProvider paramActionProvider)
  {
    return new a(this.mContext, paramActionProvider);
  }
  
  final class a
    extends i.a
    implements ActionProvider.VisibilityListener
  {
    d.b KV;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super(paramContext, paramActionProvider);
    }
    
    public final void a(d.b paramb)
    {
      this.KV = paramb;
      this.KS.setVisibilityListener(this);
    }
    
    public final boolean isVisible()
    {
      return this.KS.isVisible();
    }
    
    public final void onActionProviderVisibilityChanged(boolean paramBoolean)
    {
      if (this.KV != null) {
        this.KV.bI();
      }
    }
    
    public final View onCreateActionView(MenuItem paramMenuItem)
    {
      return this.KS.onCreateActionView(paramMenuItem);
    }
    
    public final boolean overridesItemVisibility()
    {
      return this.KS.overridesItemVisibility();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */