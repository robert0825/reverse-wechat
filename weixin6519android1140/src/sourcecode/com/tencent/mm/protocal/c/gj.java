package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gj
  extends ayx
{
  public int tSK;
  public String tUA;
  public String tUB;
  public String tUC;
  public int tUv;
  public String tUw;
  public String tUx;
  public String tUy;
  public String tUz;
  
  public gj()
  {
    GMTrace.i(3815273136128L, 28426);
    GMTrace.o(3815273136128L, 28426);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3815407353856L, 28427);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tSK);
      paramVarArgs.fk(3, this.tUv);
      if (this.tUw != null) {
        paramVarArgs.e(4, this.tUw);
      }
      if (this.tUx != null) {
        paramVarArgs.e(5, this.tUx);
      }
      if (this.tUy != null) {
        paramVarArgs.e(6, this.tUy);
      }
      if (this.tUz != null) {
        paramVarArgs.e(7, this.tUz);
      }
      if (this.tUA != null) {
        paramVarArgs.e(8, this.tUA);
      }
      if (this.tUB != null) {
        paramVarArgs.e(9, this.tUB);
      }
      if (this.tUC != null) {
        paramVarArgs.e(10, this.tUC);
      }
      GMTrace.o(3815407353856L, 28427);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tSK) + b.a.a.a.fh(3, this.tUv);
      paramInt = i;
      if (this.tUw != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tUw);
      }
      i = paramInt;
      if (this.tUx != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tUx);
      }
      paramInt = i;
      if (this.tUy != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tUy);
      }
      i = paramInt;
      if (this.tUz != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tUz);
      }
      paramInt = i;
      if (this.tUA != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tUA);
      }
      i = paramInt;
      if (this.tUB != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tUB);
      }
      paramInt = i;
      if (this.tUC != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tUC);
      }
      GMTrace.o(3815407353856L, 28427);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3815407353856L, 28427);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gj localgj = (gj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3815407353856L, 28427);
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
          localgj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3815407353856L, 28427);
        return 0;
      case 2: 
        localgj.tSK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3815407353856L, 28427);
        return 0;
      case 3: 
        localgj.tUv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3815407353856L, 28427);
        return 0;
      case 4: 
        localgj.tUw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3815407353856L, 28427);
        return 0;
      case 5: 
        localgj.tUx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3815407353856L, 28427);
        return 0;
      case 6: 
        localgj.tUy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3815407353856L, 28427);
        return 0;
      case 7: 
        localgj.tUz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3815407353856L, 28427);
        return 0;
      case 8: 
        localgj.tUA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3815407353856L, 28427);
        return 0;
      case 9: 
        localgj.tUB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3815407353856L, 28427);
        return 0;
      }
      localgj.tUC = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3815407353856L, 28427);
      return 0;
    }
    GMTrace.o(3815407353856L, 28427);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\gj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */