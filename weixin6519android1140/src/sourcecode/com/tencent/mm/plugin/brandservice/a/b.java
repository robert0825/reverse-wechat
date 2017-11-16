package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.d;
import com.tencent.mm.storage.x;

public final class b
  extends com.tencent.mm.bm.a
{
  public x iBi;
  public d jsU;
  public String userName;
  
  public b()
  {
    GMTrace.i(10847476776960L, 80820);
    GMTrace.o(10847476776960L, 80820);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10847610994688L, 80821);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.userName == null) {
        throw new b.a.a.b("Not all required fields were included: userName");
      }
      if (this.userName != null) {
        paramVarArgs.e(1, this.userName);
      }
      GMTrace.o(10847610994688L, 80821);
      return 0;
    }
    if (paramInt == 1) {
      if (this.userName == null) {
        break label266;
      }
    }
    label266:
    for (paramInt = b.a.a.b.b.a.f(1, this.userName) + 0;; paramInt = 0)
    {
      GMTrace.o(10847610994688L, 80821);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.userName == null) {
          throw new b.a.a.b("Not all required fields were included: userName");
        }
        GMTrace.o(10847610994688L, 80821);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        b localb = (b)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(10847610994688L, 80821);
          return -1;
        }
        localb.userName = locala.yqV.readString();
        GMTrace.o(10847610994688L, 80821);
        return 0;
      }
      GMTrace.o(10847610994688L, 80821);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */