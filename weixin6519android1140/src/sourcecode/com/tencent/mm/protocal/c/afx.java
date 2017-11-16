package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afx
  extends azh
{
  public String eLy;
  public int ret;
  public String url;
  public int uvz;
  
  public afx()
  {
    GMTrace.i(15348870938624L, 114358);
    GMTrace.o(15348870938624L, 114358);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15349005156352L, 114359);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.ret);
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      paramVarArgs.fk(4, this.uvz);
      if (this.eLy != null) {
        paramVarArgs.e(5, this.eLy);
      }
      GMTrace.o(15349005156352L, 114359);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.ret);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.url);
      }
      i = paramInt + b.a.a.a.fh(4, this.uvz);
      paramInt = i;
      if (this.eLy != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.eLy);
      }
      GMTrace.o(15349005156352L, 114359);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(15349005156352L, 114359);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afx localafx = (afx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15349005156352L, 114359);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localafx.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15349005156352L, 114359);
        return 0;
      case 2: 
        localafx.ret = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15349005156352L, 114359);
        return 0;
      case 3: 
        localafx.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15349005156352L, 114359);
        return 0;
      case 4: 
        localafx.uvz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15349005156352L, 114359);
        return 0;
      }
      localafx.eLy = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(15349005156352L, 114359);
      return 0;
    }
    GMTrace.o(15349005156352L, 114359);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\afx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */