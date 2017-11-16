package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qc
  extends azh
{
  public int jib;
  public azp ugd;
  public int uge;
  
  public qc()
  {
    GMTrace.i(3905735884800L, 29100);
    GMTrace.o(3905735884800L, 29100);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3905870102528L, 29101);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ugd == null) {
        throw new b("Not all required fields were included: PackageBuf");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.ugd != null)
      {
        paramVarArgs.fm(2, this.ugd.aYq());
        this.ugd.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.jib);
      paramVarArgs.fk(4, this.uge);
      GMTrace.o(3905870102528L, 29101);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.ugd != null) {
        i = paramInt + b.a.a.a.fj(2, this.ugd.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.jib);
      int j = b.a.a.a.fh(4, this.uge);
      GMTrace.o(3905870102528L, 29101);
      return i + paramInt + j;
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
      if (this.ugd == null) {
        throw new b("Not all required fields were included: PackageBuf");
      }
      GMTrace.o(3905870102528L, 29101);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qc localqc = (qc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3905870102528L, 29101);
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
          localqc.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3905870102528L, 29101);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localqc.ugd = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3905870102528L, 29101);
        return 0;
      case 3: 
        localqc.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3905870102528L, 29101);
        return 0;
      }
      localqc.uge = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3905870102528L, 29101);
      return 0;
    }
    GMTrace.o(3905870102528L, 29101);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */