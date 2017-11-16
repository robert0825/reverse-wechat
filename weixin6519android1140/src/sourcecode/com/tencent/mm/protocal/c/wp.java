package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class wp
  extends azh
{
  public eb ltA;
  public int tNb;
  public int tNf;
  public String tNg;
  public bea tNh;
  public int tNp;
  
  public wp()
  {
    GMTrace.i(3955128008704L, 29468);
    GMTrace.o(3955128008704L, 29468);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3955262226432L, 29469);
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
      paramVarArgs.fk(2, this.tNf);
      paramVarArgs.fk(3, this.tNp);
      if (this.tNg != null) {
        paramVarArgs.e(4, this.tNg);
      }
      if (this.tNh != null)
      {
        paramVarArgs.fm(5, this.tNh.aYq());
        this.tNh.a(paramVarArgs);
      }
      if (this.ltA != null)
      {
        paramVarArgs.fm(6, this.ltA.aYq());
        this.ltA.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.tNb);
      GMTrace.o(3955262226432L, 29469);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tNf) + b.a.a.a.fh(3, this.tNp);
      paramInt = i;
      if (this.tNg != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tNg);
      }
      i = paramInt;
      if (this.tNh != null) {
        i = paramInt + b.a.a.a.fj(5, this.tNh.aYq());
      }
      paramInt = i;
      if (this.ltA != null) {
        paramInt = i + b.a.a.a.fj(6, this.ltA.aYq());
      }
      i = b.a.a.a.fh(7, this.tNb);
      GMTrace.o(3955262226432L, 29469);
      return paramInt + i;
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
      GMTrace.o(3955262226432L, 29469);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      wp localwp = (wp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3955262226432L, 29469);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localwp.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 2: 
        localwp.tNf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 3: 
        localwp.tNp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 4: 
        localwp.tNg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bea();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bea)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localwp.tNh = ((bea)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localwp.ltA = ((eb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3955262226432L, 29469);
        return 0;
      }
      localwp.tNb = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3955262226432L, 29469);
      return 0;
    }
    GMTrace.o(3955262226432L, 29469);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\wp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */