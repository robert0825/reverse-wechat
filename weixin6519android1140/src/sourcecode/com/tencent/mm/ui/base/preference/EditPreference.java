package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.k;

public class EditPreference
  extends Preference
{
  public i oaD;
  public String value;
  public a wjA;
  private EditText wjB;
  public Preference.a wjv;
  
  public EditPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3202703425536L, 23862);
    GMTrace.o(3202703425536L, 23862);
  }
  
  public EditPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3202837643264L, 23863);
    GMTrace.o(3202837643264L, 23863);
  }
  
  public final void a(Preference.a parama)
  {
    GMTrace.i(3202971860992L, 23864);
    this.wjv = parama;
    GMTrace.o(3202971860992L, 23864);
  }
  
  public final void showDialog()
  {
    GMTrace.i(3203106078720L, 23865);
    final EditText localEditText;
    if (this.wjB != null) {
      localEditText = this.wjB;
    }
    for (;;)
    {
      Object localObject = localEditText.getLayoutParams();
      if ((localObject instanceof ViewGroup.MarginLayoutParams))
      {
        localObject = (ViewGroup.MarginLayoutParams)localObject;
        int i = localEditText.getResources().getDimensionPixelSize(a.e.aQq);
        ((ViewGroup.MarginLayoutParams)localObject).leftMargin = i;
        ((ViewGroup.MarginLayoutParams)localObject).rightMargin = i;
        ((ViewGroup.MarginLayoutParams)localObject).topMargin = i;
        ((ViewGroup.MarginLayoutParams)localObject).bottomMargin = i;
      }
      if (localEditText.getParent() != null) {
        ((ViewGroup)localEditText.getParent()).removeView(localEditText);
      }
      this.oaD = h.a(this.mContext, getTitle().toString(), localEditText, a.X(this.mContext, a.k.cTM), a.X(this.mContext, a.k.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3241492348928L, 24151);
          if (EditPreference.this.oaD != null) {
            EditPreference.this.oaD.dismiss();
          }
          EditPreference.this.value = localEditText.getText().toString();
          if (EditPreference.this.wjA != null) {
            EditPreference.this.wjA.caW();
          }
          if (EditPreference.this.wjv != null) {
            EditPreference.this.wjv.a(EditPreference.this, EditPreference.this.value);
          }
          GMTrace.o(3241492348928L, 24151);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3208877441024L, 23908);
          if (EditPreference.this.oaD != null) {
            EditPreference.this.oaD.dismiss();
          }
          GMTrace.o(3208877441024L, 23908);
        }
      });
      GMTrace.o(3203106078720L, 23865);
      return;
      localEditText = new EditText(this.mContext);
      localEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      localEditText.setSingleLine(true);
      localEditText.setText(this.value);
    }
  }
  
  public static abstract interface a
  {
    public abstract void caW();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\EditPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */