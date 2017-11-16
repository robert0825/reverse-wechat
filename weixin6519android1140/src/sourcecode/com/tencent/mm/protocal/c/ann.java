package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ann
  extends ayx
{
  public String eTJ;
  public int scene;
  public int uCq;
  public int uCr;
  
  public ann()
  {
    GMTrace.i(3949490864128L, 29426);
    GMTrace.o(3949490864128L, 29426);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3949625081856L, 29427);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eTJ != null) {
        paramVarArgs.e(2, this.eTJ);
      }
      paramVarArgs.fk(3, this.uCq);
      paramVarArgs.fk(4, this.uCr);
      paramVarArgs.fk(5, this.scene);
      GMTrace.o(3949625081856L, 29427);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.eTJ != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eTJ);
      }
      paramInt = b.a.a.a.fh(3, this.uCq);
      int j = b.a.a.a.fh(4, this.uCr);
      int k = b.a.a.a.fh(5, this.scene);
      GMTrace.o(3949625081856L, 29427);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3949625081856L, 29427);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ann localann = (ann)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3949625081856L, 29427);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localann.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949625081856L, 29427);
        return 0;
      case 2: 
        localann.eTJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949625081856L, 29427);
        return 0;
      case 3: 
        localann.uCq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949625081856L, 29427);
        return 0;
      case 4: 
        localann.uCr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949625081856L, 29427);
        return 0;
      }
      localann.scene = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3949625081856L, 29427);
      return 0;
    }
    GMTrace.o(3949625081856L, 29427);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ann.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */