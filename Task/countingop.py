student = ['andrew','akshat','chris','harsit','lary','tim','drake','ashish','shubham']

def randomFunction(students):
    first = students[0]
    total = 0
    new_list = []

    for student in students:
        total += 1
        new_list.append(student)

    print(new_list)
    return total

print(randomFunction(student))