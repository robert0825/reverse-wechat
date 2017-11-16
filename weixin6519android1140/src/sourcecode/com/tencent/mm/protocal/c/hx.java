package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hx
  extends com.tencent.mm.bm.a
{
  public String tVU;
  public LinkedList<String> tWU;
  
  public hx()
  {
    GMTrace.i(3693000785920L, 27515);
    this.tWU = new LinkedList();
    GMTrace.o(3693000785920L, 27515);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3693135003648L, 27516);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVU == null) {
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (this.tVU != null) {
        paramVarArgs.e(2, this.tVU);
      }
      paramVarArgs.d(3, 1, this.tWU);
      GMTrace.o(3693135003648L, 27516);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVU == null) {
        break label338;
      }
    }
    label338:
    for (paramInt = b.a.a.b.b.a.f(2, this.tVU) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.c(3, 1, this.tWU);
      GMTrace.o(3693135003648L, 27516);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.tWU.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tVU == null) {
          throw new b("Not all required fields were included: brand_user_name");
        }
        GMTrace.o(3693135003648L, 27516);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        hx localhx = (hx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3693135003648L, 27516);
          return -1;
        case 2: 
          localhx.tVU = locala.yqV.readString();
          GMTrace.o(3693135003648L, 27516);
          return 0;
        }
        localhx.tWU.add(locala.yqV.readString());
        GMTrace.o(3693135003648L, 27516);
        return 0;
      }
      GMTrace.o(3693135003648L, 27516);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\hx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */