package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aoq
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public azq tPF;
  
  public aoq()
  {
    GMTrace.i(4015928639488L, 29921);
    GMTrace.o(4015928639488L, 29921);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4016062857216L, 29922);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPF == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.tPF != null)
      {
        paramVarArgs.fm(1, this.tPF.aYq());
        this.tPF.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jhA);
      GMTrace.o(4016062857216L, 29922);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tPF != null) {
        paramInt = b.a.a.a.fj(1, this.tPF.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.jhA);
      GMTrace.o(4016062857216L, 29922);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tPF == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      GMTrace.o(4016062857216L, 29922);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aoq localaoq = (aoq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4016062857216L, 29922);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaoq.tPF = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4016062857216L, 29922);
        return 0;
      }
      localaoq.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4016062857216L, 29922);
      return 0;
    }
    GMTrace.o(4016062857216L, 29922);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aoq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */