#!bin/bash
read -p "Enter a filename: " name
if[-e "$name"]
	then
		echo "File is Present"
		if[-x "$name"]
			then
				echo "file is executable"
		else
			echo "file is not executable"
		fi
		if[-r "$name"]
			then
				echo "file is readable"
		else
			echo"file is not readable"
		fi
		if[-w "$name"]
			then
				echo "file is writable"
		else
			echo "file is not writable"
		fi
		if([-r "$name"] && [-w "$name"])
			then
				echo "both readable an writable"
		fi
else
	echo "file doesn't exist"
fi

