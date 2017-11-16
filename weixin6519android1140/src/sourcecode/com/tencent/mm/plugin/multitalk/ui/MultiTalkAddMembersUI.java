package com.tencent.mm.plugin.multitalk.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.plugin.multitalk.ui.widget.b;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;

public class MultiTalkAddMembersUI
  extends MultiTalkSelectContactUI
{
  public MultiTalkAddMembersUI()
  {
    GMTrace.i(4788351664128L, 35676);
    GMTrace.o(4788351664128L, 35676);
  }
  
  protected final void MP()
  {
    GMTrace.i(4788485881856L, 35677);
    super.MP();
    this.mUn.setBackgroundResource(R.e.aNr);
    this.mUn.setPadding(b.nod, b.nod, b.nod, 0);
    GMTrace.o(4788485881856L, 35677);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\MultiTalkAddMembersUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */